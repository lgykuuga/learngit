package com.lgy.lamdba.domain;

import lombok.Data;

@Data
public class Person {

    private String name;
    private int age;
    private int work;
    private Box box;

    public Person(String name, int age, int work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public Person() {
    }
}
