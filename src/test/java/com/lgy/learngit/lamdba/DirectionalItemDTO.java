package com.lgy.learngit.lamdba;

import io.swagger.annotations.ApiModelProperty;

public class DirectionalItemDTO {

    @ApiModelProperty("序号")
    private Integer productIndex;

    public Integer getProductIndex() {
        return productIndex;
    }

    public void setProductIndex(Integer productIndex) {
        this.productIndex = productIndex;
    }
}
