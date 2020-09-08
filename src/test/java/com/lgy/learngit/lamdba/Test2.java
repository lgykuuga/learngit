package com.lgy.learngit.lamdba;

public class Test2 {
    public static void main(String[] args) {

        doCreateAttribute(null);


    }


    public static void doCreateAttribute(String categoryName) {
        switch (categoryName) {
            // 机油
            case "1" :
                System.out.println("1");
            case "2" :
                System.out.println("2");
            case "3" :

            default:
                System.out.println("4");
        }
    }

}
