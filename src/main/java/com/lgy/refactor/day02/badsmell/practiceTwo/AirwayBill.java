/* 以下代码有什么坏味道？ */

package com.lgy.refactor.day02.badsmell.practiceTwo;

public class AirwayBill { // 快递单
    private CustomerName toCustomerName;
    private CustomerName fromCustomerName;
    private Address toAddress;
    private Address fromAddress;


    private String output(CustomerName customerName, Address address) {
        return customerName.toString() + System.lineSeparator() + address.toString();
    }

    public String to() {
        return output(toCustomerName, toAddress);
    }

    public String from() {
        return output(fromCustomerName, fromAddress);
    }

    public void setToAddress(Address address) {
        this.toAddress = address;
    }


    public void setToCustomerName(CustomerName customerName) {
        this.toCustomerName = customerName;
    }

    public void setFromAddress(Address address) {
        this.fromAddress = address;
    }

    public void setFromCustomerName(CustomerName customerName) {
        this.fromCustomerName = customerName;
    }
}
