package com.lgy.lamdba.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Person {

    private String name;
    private int age;
    private int work;
    private BigDecimal salary;
    private Box box;

    public Person(String name, int age, int work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public Person(String name, int age, int work, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
    }

    public Person() {
    }
}
