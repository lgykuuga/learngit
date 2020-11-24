package com.lgy.future.service.deduct;


import com.lgy.future.contant.BizMsgConstant;
import com.lgy.future.domain.DeductResourceResult;
import com.lgy.future.domain.OrderSubmitContext;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;


/**
 * 使用店铺优惠券
 *
 * @author LGy
 */
@Slf4j
public class DefaultDeductSellerCouponService implements DeductResourceService {



    @Override
    public boolean isUseResource(OrderSubmitContext context) {
        log.info("不使用店铺优惠券");
        return false;
    }

    @Override
    public DeductResourceResult deduct(OrderSubmitContext context) {

        if (Objects.isNull(context)) {
            return new DeductResourceResult<String>().error(BizMsgConstant.CONTEXT_NOT_NULL);
        }
        log.info("使用店铺优惠券成功");
        return new DeductResourceResult<String>().success(BizMsgConstant.REFUND_SELLER_COUPON_SUCCESS);
    }

    @Override
    public RollbackDeductResourceResult rollback(OrderSubmitContext context) {
        if (Objects.isNull(context)) {
            return new RollbackDeductResourceResult<String>().error(BizMsgConstant.CONTEXT_NOT_NULL);
        }
        log.info("回退店铺优惠券成功");
        return new RollbackDeductResourceResult<String>().success(BizMsgConstant.REFUND_SELLER_COUPON_SUCCESS);
    }
}
