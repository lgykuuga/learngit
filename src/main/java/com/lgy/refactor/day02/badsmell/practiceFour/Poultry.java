package com.lgy.refactor.day02.badsmell.practiceFour;

public abstract class Poultry extends Animal {

    private static final String GET_AN_EGG = "Get an egg.";

    private String layEgg() { // 下蛋
        return GET_AN_EGG;
    }

    @Override
    public String provide() {
        return layEgg();
    }
}
