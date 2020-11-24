package com.lgy.future.contant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * BizMsgConstant BizMsgConstant
 *
 * @author LGy
 * @date 2020-11-13
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class BizMsgConstant {

    public static final String CONTEXT_NOT_NULL = "context不能为空";

    public static final String DEDUCT_GOLD_COIN_SUCCESS = "提交订单时扣减金币成功";
    public static final String DEDUCT_GOLD_COIN_FAIL = "提交订单时扣减金币失败";
    public static final String REFUND_GOLD_COIN_SUCCESS = "提交订单时回退金币成功";
    public static final String REFUND_GOLD_COIN_FAIL = "提交订单时回退金币失败";

    public static final String DEDUCT_INVENTORY_SUCCESS = "提交订单时扣减商品库存成功";
    public static final String DEDUCT_INVENTORY_FAIL = "提交订单时扣减商品库存失败";
    public static final String REFUND_INVENTORY_SUCCESS = "提交订单时回退商品库存成功";
    public static final String REFUND_INVENTORY_FAIL = "提交订单时回退商品库存失败";

    public static final String DEDUCT_PLATFORM_COUPON_SUCCESS = "提交订单时扣减平台优惠券成功";
    public static final String DEDUCT_PLATFORM_COUPON_FAIL = "提交订单时扣减平台优惠券失败";
    public static final String REFUND_PLATFORM_COUPON_SUCCESS = "提交订单时回退平台优惠券成功";
    public static final String REFUND_PLATFORM_COUPON_FAIL = "提交订单时回退平台优惠券失败";

    public static final String DEDUCT_SELLER_COUPON_SUCCESS = "提交订单时扣减卖家优惠券成功";
    public static final String DEDUCT_SELLER_COUPON_FAIL = "提交订单时扣减卖家优惠券失败";
    public static final String REFUND_SELLER_COUPON_SUCCESS = "提交订单时回退卖家优惠券成功";
    public static final String REFUND_SELLER_COUPON_FAIL = "提交订单时回退卖家优惠券失败";

    public static final String DEDUCT_ITEM_INVOICE_INVENTORY_SUCCESS = "提交订单时扣减对项发票库存成功";
    public static final String DEDUCT_ITEM_INVOICE_INVENTORY_FAIL = "提交订单时扣减对项发票库存失败";
    public static final String REFUND_ITEM_INVOICE_INVENTORY_SUCCESS = "提交订单时回退对项发票库存成功";
    public static final String REFUND_ITEM_INVOICE_INVENTORY_FAIL = "提交订单时回退对项发票库存失败";

}
