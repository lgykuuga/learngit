package com.lgy.learngit.supplier;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> uuid = () -> UUID.randomUUID().toString();
        Supplier<String> dateTime = () -> System.currentTimeMillis() + "";

        System.out.println(getResult(uuid));
        System.out.println(getResult(dateTime));

        System.out.println("------------------");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getResult(uuid));
        System.out.println(getResult(dateTime));

    }

    private static String getResult(Supplier<String> supplier) {
        return supplier.get();
    }

}
