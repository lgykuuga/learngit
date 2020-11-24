package com.lgy.future.service.deduct;


import com.lgy.future.contant.BizMsgConstant;
import com.lgy.future.domain.DeductResourceResult;
import com.lgy.future.domain.OrderSubmitContext;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;


/**
 * 扣减金币
 *
 * @author LGy
 */
@Slf4j
public class DefaultDeductGoldCoinService implements DeductResourceService {

    @Override
    public boolean isUseResource(OrderSubmitContext context) {
        log.info("使用金币");
        return false;
    }

    @Override
    public DeductResourceResult deduct(OrderSubmitContext context) {

        if (Objects.isNull(context)) {
            return new DeductResourceResult<String>().error(BizMsgConstant.CONTEXT_NOT_NULL);
        }
        log.info("使用金币成功");
        return new DeductResourceResult<String>().success(BizMsgConstant.DEDUCT_GOLD_COIN_SUCCESS);
    }

    @Override
    public RollbackDeductResourceResult rollback(OrderSubmitContext context) {

        if (Objects.isNull(context)) {
            return new RollbackDeductResourceResult<String>().error(BizMsgConstant.CONTEXT_NOT_NULL);
        }
        log.info("回退金币成功");
        return new RollbackDeductResourceResult<String>().error(BizMsgConstant.REFUND_GOLD_COIN_SUCCESS);
    }


}
