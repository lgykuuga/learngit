package com.lgy.future;

import java.util.concurrent.CompletableFuture;

/**
 * 异步消费示例
 *
 * 相较于前一个示例的同步方式，我们也对应有异步方式
 *
 * 消费者是同步执行的，所以不需要在 CompletableFuture 里对结果进行合并。
 */
public class CompletableFuture09 {

    public static void main(String[] args) {
        thenAcceptAsyncExample();
    }

    static void thenAcceptAsyncExample() {
        StringBuilder result = new StringBuilder();
        CompletableFuture<Void> cf = CompletableFuture.completedFuture("thenAcceptAsync message")
                .thenAcceptAsync(s ->result.append(s));
        cf.join();
        if (result.length() <= 0) {
            System.out.println("Result was empty");
        }
        System.out.println(result.length());
    }

}
