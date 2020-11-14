package com.lgy.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * CompletableFuture02
 * 
 * @author LGy
 * @date 2020-11-09
 */
public class CompletableFuture02 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> cfQuery = CompletableFuture.supplyAsync(() -> queryCode("中国石油"));
        
        //cfQuery成功继续执行下一个任务
        CompletableFuture<Double> cfFetch = cfQuery.thenApplyAsync(CompletableFuture02::fetchPrice);

        cfFetch.thenAccept((result) -> {
            System.out.println("price:" + result);
        });
        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭:
        Thread.sleep(2000);
    }

    private static Double fetchPrice(String code) throws RuntimeException {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }

//        throw new RuntimeException("123");
        return 5 + Math.random() * 20;
    }

    private static String queryCode(String name) {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            
        }


        return "601857";
    }


}
