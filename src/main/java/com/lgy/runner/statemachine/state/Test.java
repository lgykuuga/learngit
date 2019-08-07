package com.lgy.runner.statemachine.state;

public class Test {
    public static void main(String[] args) {
        try {
            Test test = new Test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Test() {
        State state = new State();
        Context context = new Context(state);

        // 状态1
        state.setValue("state1");
        context.method();

        // 状态2
        state.setValue("state2");
        context.method();
    }
}
