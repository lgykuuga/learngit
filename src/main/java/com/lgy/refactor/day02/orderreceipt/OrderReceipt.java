package com.lgy.refactor.day02.orderreceipt;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 */
public class OrderReceipt {

    private static final String SALES_TAX = "Sales Tax";
    private static final String TOTAL_AMOUNT = "Total Amount";
    private static final String START_PRINT_ORDERS = "======Printing Orders======\n";
    private static final char JUMP_TAB = '\t';

    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {

        return START_PRINT_ORDERS +
                order.getIntroduction() +
                order.getLineItemsRender() +
                SALES_TAX + JUMP_TAB + order.getTotalSaleTax() +
                TOTAL_AMOUNT + JUMP_TAB + order.getTotalAmountWithTax();
    }

}