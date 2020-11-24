package com.lgy.future.service.task;

import lombok.Data;

import java.beans.ConstructorProperties;

/**
 * TaskResult
 *
 * @author LGy
 * @date 2020-11-14
 */
@Data
public class TaskResult<T> {

    private static final String SUCCESS_CODE = "200";

    private static final String ERROR_CODE = "500";

    private boolean success;

    private String httpCode;

    private String resultCode;

    private String description;

    private T data;

    public static <T> TaskResult<T> success(T data) {
        return new TaskResult<>(true, SUCCESS_CODE, "", "", data);
    }

    public static <T> TaskResult<T> success() {
        return new TaskResult<>(true, SUCCESS_CODE, "", "", null);
    }

    public static <T> TaskResult<T> error(String errorMessage) {
        return new TaskResult<>(false, ERROR_CODE, "", errorMessage, null);
    }

    public static <T> TaskResult<T> error(String errorMessage, T data) {
        return new TaskResult<>(false, ERROR_CODE, "", errorMessage, data);
    }

    public static <T> TaskResult<T> error(String httpCode, String resultCode, String errorMessage, T data) {
        return new TaskResult<>(false, httpCode, resultCode, errorMessage, data);
    }

    @ConstructorProperties({"code", "httpCode", "resultCode", "description", "data"})
    public TaskResult(boolean success, String httpCode, String resultCode,
                      String description, T data) {
        this.success = success;
        this.httpCode = httpCode;
        this.resultCode = resultCode;
        this.description = description;
        this.data = data;
    }

}
