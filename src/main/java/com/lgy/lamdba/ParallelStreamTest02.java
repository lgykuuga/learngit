package com.lgy.lamdba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParallelStreamTest02 {

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

    private static void test4(List<Integer> list) {
        List<Integer> parseList = new ArrayList<>();
        //parallelStream遍历数据的时候会产生丢失的问题
        for (int i = 0; i < 10 ; i++) {
            list.parallelStream().forEach(integer -> parseList.add(integer));
            System.out.println("test4:每次遍历的集合长度:"+ parseList.size());
        }
    }

    private static void test3(List<Integer> list) {
        List<Integer> parseList = new ArrayList<>();
        //parallelStream遍历数据的时候会产生丢失的问题
        for (int i = 0; i < 10 ; i++) {
            list.parallelStream().forEach(integer -> {
                parseList.add(null);
                parseList.addAll(Collections.emptyList());
            });
            System.out.println("test3:每次遍历的集合长度:"+ parseList.size());
        }
    }

    private static void test2(List<Integer> list) {

        List<Integer> parseList = new ArrayList<>();
        List<Integer> synchronizedList = Collections.synchronizedList(parseList);
        //parallelStream遍历数据的时候会产生丢失的问题
        for (int i = 0; i < 10 ; i++) {
            list.parallelStream().forEach(integer -> synchronizedList.add(integer));
            System.out.println("test2:每次遍历的集合长度:"+ synchronizedList.size());
        }
        System.out.println("test2:遍历的集合长度共:"+ synchronizedList.size());
    }

    private static void test1(List<Integer>  list) {

        //parallelStream遍历数据的时候会产生丢失的问题
        for (int i = 0; i < 10 ; i++) {

            List<Integer> parseList = new ArrayList<>();
            List<Integer> synchronizedList = Collections.synchronizedList(parseList);
            list.parallelStream().forEach(integer -> synchronizedList.add(integer));
            System.out.println("test1:每次遍历的集合长度:"+ synchronizedList.size());
        }
    }

}