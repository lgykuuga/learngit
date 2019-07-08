package com.lgy.jvm.run;

/**
 * Volatile原子级测试
 */
public class VolatileAtomicTest {

    public static volatile int num = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        increase();
                    }
                }
            };
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println(num);// 1000 * 10 = 10000

    }

    public static synchronized void increase() {
        num++;
    }
}
