package com.lgy.future;



import com.sun.tools.javac.util.Assert;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;

/**
 * 运行两个阶段后执行
 *
 * 接下来介绍异步操作过程中的异常情况处理。
 * 下面这个示例中我们会在字符转换异步请求中刻意延迟 1 秒钟，
 * 然后才会提交到 ForkJoinPool 里面去执行。
 */
public class CompletableFuture11 {

    public static void main(String[] args) {
        runAfterBothExample();
    }

    static void runAfterBothExample() {
        String original = "Message";
        StringBuilder result = new StringBuilder();
        CompletableFuture.completedFuture(original).thenApply(String::toUpperCase).runAfterBoth(
                CompletableFuture.completedFuture(original).thenApply(String::toLowerCase),
                () -> result.append("done"));
        if (result.length() <= 0) {
            System.out.println("Result was empty");
        }
        System.out.println(result.length());
        System.out.println(original);
        System.out.println(result);
    }

}
