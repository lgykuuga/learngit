package com.lgy.future.domain;


/**
 * @author LGy
 */
public class DeductResourceResult<T> {

    private boolean success;

    private String httpCode;

    private String resultCode;

    private String description;

    /**
     * 金币、优惠券
     */
    private String resourceType;

    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(String httpCode) {
        this.httpCode = httpCode;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DeductResourceResult<T> success(String description) {
        this.success = true;
        this.description = description;
        return this;
    }


    public DeductResourceResult<T> error(String description) {
        this.success = false;
        this.description = description;
        return this;
    }

}
