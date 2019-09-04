package com.lgy.runner.strategy;

import lombok.Data;

/**
 * 订单信息
 * @author lujiahao
 * @date 2019-05-22 11:03
 */
@Data
public class OrderDTO {
    private String orderNo;

    private Integer serviceType;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }
}
