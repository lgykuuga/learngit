package com.lgy.future;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * 当所有的 CompletableFuture 完成后创建 CompletableFuture
 *
 * 我们会以同步方式执行多个异步计算过程，在所有计算过程都完成后，创建一个 CompletableFuture。
 */
public class CompletableFuture13 {

    public static void main(String[] args) {
        allOfExample();
    }

    static void allOfExample() {
        StringBuilder result = new StringBuilder();
        List<String> messages = Arrays.asList("a", "b", "c");
        List<CompletableFuture> futures = messages.stream()
                .map(msg -> CompletableFuture.completedFuture(msg).thenApply(s -> delayedUpperCase(s)))
                .collect(Collectors.toList());
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()])).whenComplete((v, th) -> {
            futures.forEach(cf -> System.out.println((cf.getNow(null))));
            result.append("done");
        });
        System.out.println(result);
    }

    private static String delayedUpperCase(String s) {
        return s.toUpperCase();
    }


}
