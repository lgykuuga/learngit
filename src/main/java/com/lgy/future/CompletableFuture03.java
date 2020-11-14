package com.lgy.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * CompletableFuture02
 * 同时从新浪和网易查询证券代码，只要任意一个返回结果，就进行下一步查询价格，
 * 查询价格也同时从新浪和网易查询，只要任意一个返回结果，就完成操作：
 *
 * 除了anyOf()可以实现“任意个CompletableFuture只要一个成功”，allOf()可以实现“所有CompletableFuture都必须成功”，
 * 这些组合操作可以实现非常复杂的异步流程控制。
 *
 * @author LGy
 * @date 2020-11-09
 */
public class CompletableFuture03 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> cfQueryFromSina = CompletableFuture.supplyAsync(() -> {
           return queryCode("中国石油", "https://finance.sina.com.cn/code/");
        });

        boolean completedExceptionally = cfQueryFromSina.isCompletedExceptionally();
        System.out.println(completedExceptionally);

        CompletableFuture<String> cfQueryFrom163 = CompletableFuture.supplyAsync(() -> {
            return queryCode("中国石油", "https://money.163.com/code/");
        });

        // 用anyOf合并为一个新的CompletableFuture:
        CompletableFuture<Object> cfQuery = CompletableFuture.anyOf(cfQueryFromSina, cfQueryFrom163);

        // 两个CompletableFuture执行异步查询:
        CompletableFuture<Double> cfFetchFromSina = cfQuery.thenApplyAsync((code) -> {
            return fetchPrice((String) code, "https://finance.sina.com.cn/price/");
        });

        CompletableFuture<Double> cfFetchFrom163 = cfQuery.thenApplyAsync((code) -> {
            return fetchPrice((String) code, "https://money.163.com/price/");
        });

        CompletableFuture<Object> cfFetch = CompletableFuture.anyOf(cfFetchFromSina, cfFetchFrom163);

        // 最终结果:
        cfFetch.thenAccept((result) -> {
            System.out.println("price: " + result);
        });
        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭:
        Thread.sleep(200);
    }

    static String queryCode(String name, String url) {
        System.out.println("query code from " + url + "...");
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException e) {
        }

        throw new RuntimeException("123");
    }

    static Double fetchPrice(String code, String url) {
        System.out.println("query price from " + url + "...");
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException e) {
        }
        return 5 + Math.random() * 20;
    }


}
