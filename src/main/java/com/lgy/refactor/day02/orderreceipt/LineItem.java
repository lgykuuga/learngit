package com.lgy.refactor.day02.orderreceipt;

public class LineItem {

    private String description;
    private double price;
    private int quantity;

    public LineItem(String description, double price, int quantity) {
        super();
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    double totalAmount() {
        return price * quantity;
    }

    double getSalesTax() {
        return totalAmount() * .10;
    }

    String render() {
        StringBuilder render = new StringBuilder();
        render.append(getDescription());
        render.append('\t');
        render.append(getPrice());
        render.append('\t');
        render.append(getQuantity());
        render.append('\t');
        render.append(totalAmount());
        render.append('\n');
        return render.toString();
    }

    double getAmountWithTax() {
        return totalAmount() + getSalesTax();
    }
}