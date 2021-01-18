package com.lgy.lamdba;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ParallelStreamTest03 {

    public static void main(String[] args) {
        List<Integer>  list  =  new ArrayList<>();
        for (int j = 0; j < 1000; j++) {
            list.add(j);
        }
        System.out.println("最开始生成的集合长度:"+list.size());

        test1(list);
        System.out.println("======================");
        test2(list);
        System.out.println("======================");
        test3(list);
        System.out.println("======================");
        test4(list);

    }

    private static void test4(List<Integer>  list) {
        System.out.println("test4:list size:" + list.size());
        System.out.println(list.stream().map(number -> CompletableFuture.supplyAsync(() -> ParallelStreamTest03.random(number))
                .whenComplete(ParallelStreamTest03::outputDeductResource))
                .map(ParallelStreamTest03::collectDeductFutureResult)
                .collect(Collectors.toList())
                .stream()
                .allMatch(Boolean::booleanValue));
    }

    private static void outputDeductResource(Boolean response, Throwable throwable) {

        if (Objects.nonNull(throwable)) {
            System.out.println("throwable：" + throwable.toString());
        }
    }

    private static boolean collectDeductFutureResult(CompletableFuture<Boolean> completableFuture) {

        try {
            return completableFuture.get();
        } catch (Exception e) {
            System.out.println("异常:" + e);
        }
        return false;

    }

    private static void test3(List<Integer>  list) {
        System.out.println("test3:list size:" + list.size());
        System.out.println(list.parallelStream()
                .map(ParallelStreamTest03::random)
                .collect(Collectors.toList())
                .stream()
                .allMatch(Boolean::booleanValue));
    }

    private static void test2(List<Integer>  list) {
        System.out.println("test2:list size:" + list.size());


        System.out.println(list.stream().allMatch(ParallelStreamTest03::random));
    }

    private static void test1(List<Integer>  list) {
        System.out.println("test1:list size:" + list.size());
        System.out.println(list.parallelStream().allMatch(ParallelStreamTest03::random));
    }

    private static boolean random(Integer number) {
        boolean b = new Random().nextBoolean();
        System.out.println("number:" + number + ",random:" + b);
        return b;
    }

}