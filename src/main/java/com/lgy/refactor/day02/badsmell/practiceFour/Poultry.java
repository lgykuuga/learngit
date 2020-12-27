package com.lgy.refactor.day02.badsmell.practiceFour;

public abstract class Poultry extends Animal {

    public String layEgg() { // 下蛋
        return "Get an egg.";
    }

    @Override
    public String provide() {
        return layEgg();
    }
}
