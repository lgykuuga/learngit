package com.lgy.refactor.day02.badsmell.practiceThree;

public class Order  extends Buyer {
    //other fields

    public Order(String buyerName, String buyerPhoneNumber, String buyerAddress) {
        //other fields
        this.buyerName = buyerName;
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public boolean sameBuyer(String buyerName, String buyerPhoneNumber, String buyerAddress) {
        return this.buyerAddress.equals(buyerAddress)
                && this.buyerName.equals(buyerName)
                && this.buyerPhoneNumber.equals(buyerPhoneNumber);
    }
}

