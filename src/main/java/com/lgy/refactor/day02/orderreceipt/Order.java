package com.lgy.refactor.day02.orderreceipt;

import java.util.List;

public class Order {
    private final String name;
    private final String address;
    private final List<LineItem> lineItems;

    public Order(String name, String address, List<LineItem> lineItems) {
        this.name = name;
        this.address = address;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return name;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }


    String getIntroduction() {
        return getCustomerName() + getCustomerAddress();
    }

    public double getTotalSaleTax() {
        double totalSaleTax = 0d;
        for (LineItem lineItem : lineItems) {
            totalSaleTax += lineItem.getSalesTax();
        }
        return totalSaleTax;
    }

    String getLineItemsRender() {

        StringBuilder stringBuilder = new StringBuilder();
        for (LineItem lineItem : lineItems) {
            stringBuilder.append(lineItem.render());
        }

        return stringBuilder.toString();
    }

    double getTotalAmountWithTax() {
        double totalAmountWithTax = 0d;
        for (LineItem lineItem : lineItems) {
            totalAmountWithTax += lineItem.getAmountWithTax();
        }
        return totalAmountWithTax;
    }
}
