package com.lgy.jvm.run;

/**
 * ObjectTest01
 * 
 * @author LGy
 * @date 2020-11-25
 */
public class ObjectTest01 {
    public static void main(String[] args) {
        Data data = new Data();
        data.num = 10;

        Data new1 = data;
        Data new2 = data;
        new2 = null;
        data = null;
        System.out.println(new1.num);
    }

}

class Data {
    int num;
}