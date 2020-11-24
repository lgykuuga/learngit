package com.lgy.future.service.task;


import com.lgy.future.domain.OrderSubmitContext;
import com.lgy.future.exception.BuyException;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * CompletableFutureMyTest buy系统编排资源测试
 *
 * @author LGy
 * @date 2020-11-18
 */
@Slf4j
public class TaskRuleService {

    public static void main(String[] args) {
        try {
            execute(new OrderSubmitContext());
            log.info("无异常");
        } catch (BuyException e) {
            log.error("调用Buy业务异常:{}.", e.getCode(), e);
        } catch (Exception e) {
            log.error("调用Buy系统异常.", e);
        }
    }

    private static void execute(OrderSubmitContext context) throws ExecutionException, InterruptedException {

        TaskHandler defaultCheckBuyerRuleService = new DefaultCheckBuyerRuleService();
        TaskHandler defaultCheckSellerRuleService = new DefaultCheckSellerRuleService();
        TaskHandler defaultDeductResourceService = new DefaultDeductResourceService();
        TaskHandler defaultIdempotentService = new DefaultIdempotentService();

        log.info("打印");

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() ->
                defaultCheckBuyerRuleService.execute(context))
                .thenRunAsync(() -> defaultCheckSellerRuleService.execute(context))
                .thenRunAsync(() -> defaultDeductResourceService.execute(context))
                .thenRunAsync(() -> defaultIdempotentService.execute(context))
                .whenComplete((response, throwable) -> outputLog(context, throwable));

        log.info("执行完毕");
        voidCompletableFuture.get();
    }

    private static void outputLog(OrderSubmitContext context, Throwable throwable) {

        if (throwable != null) {
            log.error(throwable.getMessage());
            throwable.printStackTrace();
            log.info("执行异常");
            throw new BuyException("110","1434");
        }
    }

}
