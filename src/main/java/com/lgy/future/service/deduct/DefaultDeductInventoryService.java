package com.lgy.future.service.deduct;


import com.lgy.future.contant.BizMsgConstant;
import com.lgy.future.domain.DeductResourceResult;
import com.lgy.future.domain.OrderSubmitContext;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;


/**
 * 扣减库存
 *
 * @author LGy
 */
@Slf4j
public class DefaultDeductInventoryService implements DeductResourceService {

    @Override
    public boolean isUseResource(OrderSubmitContext context) {
        log.info("使用扣减库存");
        return true;
    }

    @Override
    public DeductResourceResult deduct(OrderSubmitContext context) {

        if (Objects.isNull(context)) {
            return new DeductResourceResult<String>().error(BizMsgConstant.CONTEXT_NOT_NULL);
        }
        log.info("扣减库存成功");
        return new DeductResourceResult<String>().success(BizMsgConstant.DEDUCT_INVENTORY_SUCCESS);
    }

    @Override
    public RollbackDeductResourceResult rollback(OrderSubmitContext context) {

        if (Objects.isNull(context)) {
            return new RollbackDeductResourceResult<String>().error(BizMsgConstant.CONTEXT_NOT_NULL);
        }
        log.info("回退库存成功");
        return new RollbackDeductResourceResult<String>().error(BizMsgConstant.REFUND_PLATFORM_COUPON_SUCCESS);
    }
}
