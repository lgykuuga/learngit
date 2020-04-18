package com.lgy.learngit.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description ListTest
 * @Author LGy
 * @Date 2020/4/18 13:34
 **/
public class SubListTest {

    public static void main(String[] args) {
        List<Integer> dataList = new ArrayList<Integer>();

        for (int i = 0; i < 38; i++) {
            dataList.add(i);
        }

        //分批处理

        //限制条数
        int pointsDataLimit = 10;

        int size = dataList.size();

        if (pointsDataLimit < size) {
            //分批次
            int part = size/pointsDataLimit;
            System.out.println("共有 ： "+size+"条，！"+" 分为 ："+ (part + 1) + "批");

            for (int i = 0; i < part; i++) {
                List<Integer> listPage = dataList.subList(0, pointsDataLimit);
                System.out.println(listPage);
                dataList.subList(0, pointsDataLimit).clear();
            }

            if (!dataList.isEmpty()) {
                System.out.println(dataList);
            }
        } else {
            System.out.println(dataList);
        }

    }


}
