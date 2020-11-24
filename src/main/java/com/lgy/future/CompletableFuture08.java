package com.lgy.future;

import java.util.concurrent.CompletableFuture;

/**
 * 作为消费者消费计算结果示例
 *
 * 假设我们本次计算只需要前一次的计算结果，而不需要返回本次计算结果，
 * 那就有点类似于生产者（前一次计算）-消费者（本次计算）模式了，示例代码如清单 10 所示。
 *
 * 消费者是同步执行的，所以不需要在 CompletableFuture 里对结果进行合并。
 */
public class CompletableFuture08 {

    public static void main(String[] args) {
        thenAcceptExample();
    }

    static void thenAcceptExample() {
        StringBuilder result = new StringBuilder();
        CompletableFuture.completedFuture("thenAccept message")
                .thenAccept(s ->result.append(s));
        if (result.length() <= 0) {
            System.out.println("Result was empty");
        }
        System.out.println(result.length());
    }

}
