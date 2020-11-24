package com.lgy.future.service.deduct;


import com.lgy.future.domain.DeductResourceResult;
import com.lgy.future.domain.OrderSubmitContext;

/**
 * 扣减和回滚资源抽象类
 *
 * @author xiqin.liu
 */
public interface DeductResourceService  {

    /**
     * 判断是否使用资源, 如果使用了资源，需要后续执行扣减操作和响应的回滚操作，
     *
     * @param context
     * @return
     */
    boolean isUseResource(OrderSubmitContext context);

    /**
     * 扣减资源接口
     *
     * @param context
     * @return
     */
    DeductResourceResult deduct(OrderSubmitContext context);

    /**
     * 扣减资源回滚接口
     *
     * @param context
     * @return
     */
    RollbackDeductResourceResult rollback(OrderSubmitContext context);
}
