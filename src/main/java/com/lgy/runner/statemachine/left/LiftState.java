package com.lgy.runner.statemachine.left;

/**
 * 定义电梯的状态：打开、关闭、运行、停止
 */
public interface LiftState {

    void open();

    void close();

    void run();

    void stop();
}
