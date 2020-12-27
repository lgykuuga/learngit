package com.lgy.refactor.day02.badsmell.practiceFour;

public abstract class Mammals extends Animal {

    public String milk() {
        return "Get milk.";
    }

    @Override
    public String provide() {
        return milk();
    }
}
