package com.lgy.future;

import java.util.concurrent.CompletableFuture;

/**
 * 同步执行动作示例
 *
 * 以上代码在异步计算正常完成的前提下将执行动作（此处为转换成大写字母）。
 */
public class CompletableFuture06 {

    public static void main(String[] args) {
        thenApplyExample();
    }

    static void thenApplyExample() {
        CompletableFuture<String>cf = CompletableFuture.completedFuture("message").thenApply(s -> {
            System.out.println(Thread.currentThread().isDaemon());
            return s.toUpperCase();
        });
        System.out.println("MESSAGE:" + cf.getNow(null));
    }





}
