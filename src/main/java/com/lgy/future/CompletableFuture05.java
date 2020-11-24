package com.lgy.future;

import java.util.concurrent.CompletableFuture;

/**
 * 运行简单的异步场景
 *
 *     1.CompletableFuture 是异步执行方式；
 *     2.使用 ForkJoinPool 实现异步执行，这种方式使用了 daemon 线程执行 Runnable 任务。
 */
public class CompletableFuture05 {

    public static void main(String[] args) {
        runAsyncExample();
    }

    static void runAsyncExample(){
        CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
            System.out.println("1：" + Thread.currentThread().isDaemon());
            randomSleep();
        });

        System.out.println("2：" + cf.isDone());
        sleepEnough();
        System.out.println("3：" + cf.isDone());

    }

    private static void sleepEnough() {
        System.out.println("主线程被唤醒");
    }

    private static void randomSleep() {

        try {
            Thread.sleep((int)(Math.random()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
