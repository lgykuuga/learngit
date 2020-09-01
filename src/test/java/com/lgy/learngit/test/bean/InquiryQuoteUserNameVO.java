package com.lgy.learngit.test.bean;


/**
 * @Description 获取报价人VO
 * @Author LGy
 * @Date 2020/4/15
 */
public class InquiryQuoteUserNameVO {

    /**
     * 询价单号
     */
    private String shoppingListId;

    /**
     * 报价员ID
     */
    private String quoteUserId;

    /**
     * 报价员名称
     */
    private String quoteUserName;

    public String getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(String shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public String getQuoteUserId() {
        return quoteUserId;
    }

    public void setQuoteUserId(String quoteUserId) {
        this.quoteUserId = quoteUserId;
    }

    public String getQuoteUserName() {
        return quoteUserName;
    }

    public void setQuoteUserName(String quoteUserName) {
        this.quoteUserName = quoteUserName;
    }
}
