package com.lgy.future.exception;

import com.lgy.future.service.task.TaskResult;

public class BuyException extends RuntimeException {

    private String code;

    public BuyException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BuyException(TaskResult taskResult, String message) {
        super(message);
        System.out.println(taskResult);
    }

    public String getCode() {
        return code;
    }
}
