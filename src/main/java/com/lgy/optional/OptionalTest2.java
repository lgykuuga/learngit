package com.lgy.optional;

import java.util.Date;
import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] arg) {
        //创建Optional对象，如果参数为空直接抛出异常
        Optional<String> str=Optional.of("a");

        //获取Optional中的数据,如果不存在，则抛出异常
        System.out.println(str.get());

        //optional中是否存在数据
        System.out.println(str.isPresent());

        //获取Optional中的值，如果值不存在，返回参数指定的值
        System.out.println(str.orElse("b"));

        //获取Optional中的值，如果值不存在，返回lambda表达式的结果
        System.out.println(str.orElseGet(()->new Date().toString()));

        //获取Optional中的值，如果值不存在，抛出指定的异常
        System.out.println(str.orElseThrow(()->new RuntimeException()));

        System.out.println("----------");

        Optional<String> str2=Optional.ofNullable(null);

        //optional中是否存在数据
        System.out.println(str2.isPresent());

        //获取Optional中的值，如果值不存在，返回参数指定的值
        System.out.println(str2.orElse("b"));

        //获取Optional中的值，如果值不存在，返回lambda表达式的结果
        System.out.println(str2.orElseGet(()->new Date().toString()));

        //获取Optional中的值，如果值不存在，抛出指定的异常
        System.out.println(str2.orElseThrow(()->new RuntimeException()));
    }

}
