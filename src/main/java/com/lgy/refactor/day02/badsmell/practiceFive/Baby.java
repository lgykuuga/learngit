package com.lgy.refactor.day02.badsmell.practiceFive;

public class Baby {

    private Record record;

    public Baby() {
        record = new Record();
    }

    public void eat() {
        increase(BehaviorEnum.EAT.name());
    }

    public void drink() {
        increase(BehaviorEnum.DRINK.name());
    }

    public void cry() {
        increase(BehaviorEnum.CRY.name());
    }

    public void snore() {
        increase(BehaviorEnum.SNORE.name());
    }

    public long getTimes(String behavior) {
        return record.getTimes(behavior);
    }

    private void increase(String behavior) {
        record.increase(behavior);
    }
}
