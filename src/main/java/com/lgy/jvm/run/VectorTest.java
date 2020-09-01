package com.lgy.jvm.run;

import java.util.Vector;

/**
 * Volatile原子级测试
 */
public class VectorTest {

    public static volatile int num = 0;

    public static void main(String[] args) throws InterruptedException {

        Vector<String> vectors = new Vector<>();

        Thread[] threads = new Thread[10000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> vectors.add(Thread.currentThread().getName()));
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }



        System.out.println(vectors.size());

    }


}
