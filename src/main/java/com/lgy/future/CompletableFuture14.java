package com.lgy.future;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * 当所有的 CompletableFuture 完成后创建 CompletableFuture
 *
 * 相较于前一个同步示例，我们也可以异步执行
 */
public class CompletableFuture14 {

    public static void main(String[] args) {
        allOfAsyncExample();
    }

    static void allOfAsyncExample() {
        StringBuilder result = new StringBuilder();
        List<String> messages = Arrays.asList("a", "b", "c");
        List<CompletableFuture> futures = messages.stream()
                .map(msg -> CompletableFuture.completedFuture(msg).thenApplyAsync(s -> delayedUpperCase(s)))
                .collect(Collectors.toList());
        CompletableFuture allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
                .whenComplete((v, th) -> {
                    futures.forEach(cf -> System.out.println((cf.getNow(null))));
                    result.append("done");
                });
        allOf.join();
        System.out.println(result);
    }

    private static String delayedUpperCase(String s) {
        return s.toUpperCase();
    }


}
