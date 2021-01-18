package com.lgy.refactor.day02.badsmell.practiceFour;

public abstract class Mammals extends Animal {

    private static final String GET_MILK = "Get milk.";

    private String milk() {
        return GET_MILK;
    }

    @Override
    public String provide() {
        return milk();
    }
}
