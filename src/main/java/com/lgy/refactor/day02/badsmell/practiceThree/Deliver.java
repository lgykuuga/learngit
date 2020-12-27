package com.lgy.refactor.day02.badsmell.practiceThree;

public class Deliver extends Buyer {

    private int deliverNumber;

    private String size;
    private Double weight;

    public Deliver(int deliverNumber, String size, Double weight, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.deliverNumber = deliverNumber;
        this.size = size;
        this.weight = weight;
        this.buyerName = buyerName;
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getBuyerPhoneNumber() {
        return buyerPhoneNumber;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }
}
