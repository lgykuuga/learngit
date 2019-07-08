package com.lgy.jvm.run;

public class Math {

    private static final int CONSTAT = 666;

    public int math(){
        int a = 100;
        int b = 200;
        int c = (a + b) * 10;
        return c;

    }

    public static void main(String[] args) {
        Math math =new Math();
        math.math();
    }
}
