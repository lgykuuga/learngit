package com.lgy.future;


import java.util.concurrent.CompletableFuture;

/**
 * 运行两个阶段后执行
 *
 * 接下来介绍异步操作过程中的异常情况处理。
 * 下面这个示例中我们会在字符转换异步请求中刻意延迟 1 秒钟，
 * 然后才会提交到 ForkJoinPool 里面去执行。
 */
public class CompletableFuture12 {

    public static void main(String[] args) {
        thenAcceptBothExample();
    }

    static void thenAcceptBothExample() {
        String original = "Message";
        StringBuilder result = new StringBuilder();
        CompletableFuture.completedFuture(original).thenApply(String::toUpperCase).thenAcceptBoth(
                CompletableFuture.completedFuture(original).thenApply(String::toLowerCase),
                (s1, s2) -> result.append(s1 + s2));
        System.out.println(result.toString());
    }

}
