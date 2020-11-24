package com.lgy.future;

import java.util.concurrent.CompletableFuture;

/**
 * 异步执行动作示例
 *
 * 相较前一个示例的同步方式，以下代码实现了异步方式，仅仅是在上面的代码里的多个方法增加”Async”这样的关键字。
 */
public class CompletableFuture07 {

    public static void main(String[] args) {
        thenApplyAsyncExample();
    }

    static void thenApplyAsyncExample() {
        CompletableFuture<String>cf = CompletableFuture.completedFuture("message").thenApplyAsync(s -> {
            System.out.println(Thread.currentThread().isDaemon());
            randomSleep();
            return s.toUpperCase();
        });
        System.out.println(cf.getNow(null));
        if ("MESSAGE".equals(cf.join())) {
            System.out.println("cf.join():true");
        }
        System.out.println("after:" + cf.getNow(null));
    }

    private static void randomSleep() {

        try {
            Thread.sleep((int)(Math.random()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





}
