package com.lgy.future;

import java.util.concurrent.CompletableFuture;

/**
 * 创建完整的 CompletableFuture
 * 以上代码一般来说被用于启动异步计算，getNow(null)返回计算结果或者 null。
 */
public class CompletableFuture04 {

    public static void main(String[] args) {
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message");
        System.out.println(cf.isDone());
        System.out.println(cf.getNow(null));
    }

}
