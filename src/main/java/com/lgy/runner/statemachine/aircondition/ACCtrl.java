package com.lgy.runner.statemachine.aircondition;

public class ACCtrl {

    public static void main(String[] args) {
        Aircon0 ac = new Aircon0();//power() cool()
        System.out.println("Current State:" + ac.getState());
        action0(ac);

        System.out.println("-------------------------------");
        Aircon1 ac1 = new Aircon1();
        System.out.println("Current State:" + ac1.state.name());
        action1(ac1);

    }

    static void action0(Aircon0 ac) {
        ac.cool();
        ac.power();
        ac.cool();
        ac.cool();
        ac.power();
        ac.power();
    }

    static void action1(Aircon1 ac) {
        ac.cool();
        ac.power();
        ac.cool();
        ac.cool();
        ac.power();
        ac.power();
    }

}
