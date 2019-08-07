package com.lgy.runner.statemachine.left;

public class Test {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(new OpenState(lift));
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
