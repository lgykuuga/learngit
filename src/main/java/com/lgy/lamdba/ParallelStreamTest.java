package com.lgy.lamdba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamTest {
    public static void main(String[] args) {
        /* 创建数组，用来构建不同大小的List */
        Integer[] intArr = new Integer[200];
        List<Integer> intList = Arrays.asList(intArr);

        List<Integer> forList = new ArrayList<>();
        List<Integer> streamForList = new ArrayList<>();
        List<Integer> parallelStreamForList = new ArrayList<>();


        intList.forEach(l -> forList.add(l));
        intList.stream().forEach(l -> streamForList.add(l));
        intList.parallelStream().forEach(l -> parallelStreamForList.add(l));

        System.out.println(forList.size() + "---普通for循环数组");
        System.out.println(streamForList.size() + "---stream流for循环数组");
        System.out.println(parallelStreamForList.size() + "---parallelStream流for循环数组");
    }
}