package com.lgy.learngit.test.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "供应商报价员信息")
public class StoreQuoteUserDTO {

    @ApiModelProperty(value = "询价单号")
    private String inquiryId;

    @ApiModelProperty(value = "供应商公司ID")
    private String supplierCompanyId;

    @ApiModelProperty(value = "店铺ID")
    private String storeId;

    @ApiModelProperty(value = "当前报价员ID")
    private String quoteUserId;

    public String getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(String inquiryId) {
        this.inquiryId = inquiryId;
    }

    public String getSupplierCompanyId() {
        return supplierCompanyId;
    }

    public void setSupplierCompanyId(String supplierCompanyId) {
        this.supplierCompanyId = supplierCompanyId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getQuoteUserId() {
        return quoteUserId;
    }

    public void setQuoteUserId(String quoteUserId) {
        this.quoteUserId = quoteUserId;
    }
}
