package com.lgy.optional.domain;

public class OrderDO {

    private String orderId;

    private BuyerDO buyer;

    private SellerDO seller;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BuyerDO getBuyer() {
        return buyer;
    }

    public void setBuyer(BuyerDO buyer) {
        this.buyer = buyer;
    }

    public SellerDO getSeller() {
        return seller;
    }

    public void setSeller(SellerDO seller) {
        this.seller = seller;
    }
}
