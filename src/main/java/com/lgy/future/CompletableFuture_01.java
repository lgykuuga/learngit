package com.lgy.future;


import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * 创建 CompletableFuture
 *
 * 1. 简单的例子 可以使用如下无参构造函数简单的创建 CompletableFuture：
 */
public class CompletableFuture_01 {

    public static void main(String[] args) throws Exception {
//        CompletableFuture_01();
        whenComplete();
    }

    public static void whenComplete() throws Exception {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
            if(new Random().nextInt()%2>=0) {
                int i = 12/0;
            }
            System.out.println("run end ...");
        });

        future.whenComplete((t, action) -> System.out.println("执行完成！"));
        future.exceptionally(t -> {
            System.out.println("执行失败！"+t.getMessage());
            return null;
        });

        TimeUnit.SECONDS.sleep(2);
    }


    private static void thenApply() throws Exception {
        CompletableFuture<Long> future = CompletableFuture.supplyAsync(() -> {
            long result = new Random().nextInt(100);
            System.out.println("result1="+result);
            return result;
        }).thenApply(t -> {
            long result = t*5;
            System.out.println("result2="+result);
            return result;
        });

        long result = future.get();
        System.out.println(result);
    }

    public static void handle() throws Exception{
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            int i= 10/0;
            return new Random().nextInt(10);
        }).handle((param, throwable) -> {
            int result = -1;
            if(throwable==null){
                result = param * 2;
            }else{
                System.out.println(throwable.getMessage());
            }
            return result;
        });
        System.out.println(future.get());
    }




}
