package com.lgy.future;



import com.sun.tools.javac.util.Assert;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;

/**
 * 计算过程中的异常示例
 *
 * 接下来介绍异步操作过程中的异常情况处理。
 * 下面这个示例中我们会在字符转换异步请求中刻意延迟 1 秒钟，
 * 然后才会提交到 ForkJoinPool 里面去执行。
 */
public class CompletableFuture10 {

    public static void main(String[] args) {
        completeExceptionallyExample();
    }

    static void completeExceptionallyExample() {
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApplyAsync(String::toUpperCase);
        CompletableFuture<String>exceptionHandler = cf.handle((s, th) -> { return (th != null) ? "message upon cancel" : ""; });
        cf.completeExceptionally(new RuntimeException("completed exceptionally"));
        Assert.checkNonNull(cf.isCompletedExceptionally(), "Was not completed exceptionally");
        try {
            cf.join();
            fail("Should have thrown an exception");
        } catch(CompletionException ex) { // just for testing
            System.out.println("Was not completed exceptionally:" + cf.isCompletedExceptionally());
        }
        exceptionHandler.join();

    }

}
