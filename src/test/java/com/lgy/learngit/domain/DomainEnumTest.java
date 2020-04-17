package com.lgy.learngit.domain;

import com.lgy.learngit.enums.TerminalEnum;

/**
 * @Description 枚举测试类
 * @Author LGy
 * @Date 2020/4/17 16:28
 **/
public class DomainEnumTest {

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 终端来源
     */
    private TerminalEnum terminal;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public TerminalEnum getTerminal() {
        return terminal;
    }

    public void setTerminal(TerminalEnum terminal) {
        this.terminal = terminal;
    }
}
