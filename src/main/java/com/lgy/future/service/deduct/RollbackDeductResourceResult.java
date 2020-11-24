package com.lgy.future.service.deduct;

import lombok.Data;

/**
 * 回滚扣减资源结果
 *
 * @author xiqin.liu
 */
@Data
public class RollbackDeductResourceResult<T> {

    private boolean success;

    private String httpCode;

    private String resultCode;

    private String description;

    /**
     * 金币、优惠券、库存、对象发票、
     */
    private String resourceType;

    private T data;

    public RollbackDeductResourceResult<T> success(String description) {
        this.success = true;
        this.description = description;
        return this;
    }


    public RollbackDeductResourceResult<T> error(String description) {
        this.success = false;
        this.description = description;
        return this;
    }

}
