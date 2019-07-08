package com.lgy.jvm.run;

/**
 * 测试volatile的可见性
 */
public class VolatileVisibilityTest {

    public static volatile boolean initFlag = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                System.out.println("等待数据准备...");
                while (!initFlag) {

                }
                System.out.println("数据已准备,执行程序流程...");
            }
        }.start();

        Thread.sleep(2000);

        new Thread() {
            @Override
            public void run() {
                prepareData();
            }
        }.start();

    }

    public static void prepareData(){
        System.out.println("数据准备中...");
        initFlag = true;
        System.out.println("数据准备完毕...");
    }
}
