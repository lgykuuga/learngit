package com.lgy.future.domain;


import lombok.Data;

/**
 * 提交订单上下文， 暂时不对上下文进行抽象
 *
 * @author xiqin.liu
 */
@Data
public final class OrderSubmitContext {

    /**
     * 下单请求全局ID(服务器端产生)
     */
    private String traceId;

    /**
     * 请求ID（客户端传入）
     */
    private String requestId;


}
