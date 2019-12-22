package com.lgy.learngit.test.bean;

/**
 * @Description TODO
 * @Author LGy
 * @Date 2019/12/18 16:19
 **/
public class ShopBean {

    /**
     * 店铺编码
     */
    private String shopCode;

    /**
     * 平台编码
     */
    private String plateform;

    /**
     * 订单数量
     */
    private int orderNumber;

    public ShopBean() {
    }

    public ShopBean(String shopCode, String plateform, int orderNumber) {
        this.shopCode = shopCode;
        this.plateform = plateform;
        this.orderNumber = orderNumber;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getPlateform() {
        return plateform;
    }

    public void setPlateform(String plateform) {
        this.plateform = plateform;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "ShopBean{" +
                "shopCode='" + shopCode + '\'' +
                ", plateform='" + plateform + '\'' +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
