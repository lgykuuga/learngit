package com.lgy.future;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

/**
 * 实际案例
 *
 *
 *     首先异步地通过调用 cars()方法获取 Car 对象，返回一个 CompletionStage实例。Cars()方法可以在内部使用调用远端服务器上的 REST 服务等类似场景。
 *     然后和其他的 CompletionStage组合，通过调用 rating(manufacturerId)方法异步地返回 CompletionStage 实例。
 *     当所有的 Car 对象都被填充了 rating 后，调用 allOf()方法获取最终值。
 *     调用 whenComplete()方法打印最终的评分（rating）。
 */
public class CompletableFuture15 {

    public static void main(String[] args) {
        allOfAsyncExample();
    }

    static void allOfAsyncExample() {
//        cars().thenCompose(cars -> {
//            List<CompletionStage> updatedCars = cars.stream()
//                    .map(car -> rating(car.manufacturerId).thenApply(r -> {
//                        car.setRating(r);
//                        return car;
//                    })).collect(Collectors.toList());
//            CompletableFuture done = CompletableFuture
//                    .allOf(updatedCars.toArray(new CompletableFuture[updatedCars.size()]));
//            return done.thenApply(v -> updatedCars.stream().map(CompletionStage::toCompletableFuture)
//                    .map(CompletableFuture::join).collect(Collectors.toList()));
//        }).whenComplete((cars, th) -> {
//            if (th == null) {
//                cars.forEach(System.out::println);
//            } else {
//                throw new RuntimeException(th);
//            }
//        }).toCompletableFuture().join();

    }

    private static String delayedUpperCase(String s) {
        return s.toUpperCase();
    }


}
