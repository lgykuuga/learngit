package com.lgy.future.service.deduct;


import com.google.common.collect.Lists;
import com.lgy.future.domain.DeductResourceResult;
import com.lgy.future.domain.OrderSubmitContext;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * CompletableFutureMyTest buy系统扣减资源测试
 *
 * @author LGy
 * @date 2020-11-18
 */
@Slf4j
public class DeductResourceRuleService {

    public static void main(String[] args) {
        execute(new OrderSubmitContext());
    }

    public static void execute(OrderSubmitContext context) {

        // 判断是否使用资源
        List<DeductResourceService> deductResourceServices = loadDeductResourceServices(context);

        //扣减资源
        List<DeductResourceResult> deductResults = deduct(deductResourceServices, context);

        if (collectDeductResourceResults(deductResults)) {
            return;
        }

        log.error("{}下单扣减资源出现失败...， 准备执行下单扣减资源回滚操作...!", context.getTraceId());

        List<RollbackDeductResourceResult> rollbackResults = rollback(deductResourceServices, context);

        if (collectRollbackDeductResourceResults(rollbackResults)) {
            return;
        }

    }

    private static List<DeductResourceService> loadDeductResourceServices(OrderSubmitContext context) {

        List<DeductResourceService> deductResourceServices = Lists.newArrayList();

        deductResourceServices.add(new DefaultDeductGoldCoinService());
        deductResourceServices.add(new DefaultDeductInventoryService());
        deductResourceServices.add(new DefaultDeductItemInvoiceService());
        deductResourceServices.add(new DefaultDeductPlatformCouponService());
        deductResourceServices.add(new DefaultDeductSellerCouponService());

        return deductResourceServices.stream().filter(p -> p.isUseResource(context)).collect(Collectors.toList());
    }

    private static boolean collectDeductResourceResults(List<DeductResourceResult> resourceResults) {

        return resourceResults.stream().allMatch(DeductResourceResult::isSuccess);
    }


    private static List<DeductResourceResult> deduct(List<DeductResourceService> deductResourceServices, OrderSubmitContext context) {

        return deductResourceServices.stream()
                .map(deductResourceService -> CompletableFuture.supplyAsync(() -> deductResourceService.deduct(context))
                        .whenComplete((response, throwable) -> outputDeductResourceErrorLog(context, response, throwable)))
                .map(completableFuture -> collectDeductFutureResult(context, completableFuture))
                .collect(Collectors.toList());
    }

    private static List<RollbackDeductResourceResult> rollback(List<DeductResourceService> deductResourceServices, OrderSubmitContext context) {

        return deductResourceServices.stream()
                .map(deductResourceService -> CompletableFuture.supplyAsync(() -> deductResourceService.rollback(context))
                        .whenComplete((response, throwable) -> outputRollbackDeductResourceErrorLog(context, response, throwable)))
                .map(completableFuture -> collectRollbackFutureResult(context, completableFuture))
                .collect(Collectors.toList());
    }

    private static boolean collectRollbackDeductResourceResults(List<RollbackDeductResourceResult> resourceResults) {

        return resourceResults.stream().anyMatch(result -> !result.isSuccess());
    }

    private static void outputDeductResourceErrorLog(OrderSubmitContext context, DeductResourceResult deductResourceResponse, Throwable throwable) {

        if (Objects.nonNull(throwable)) {
            log.error("请求{}扣减资源异常, 资源类型：{}, 扣减结果:{}, error:{}",
                    context.getTraceId(),
                    deductResourceResponse.getResourceType(),
                    deductResourceResponse.getDescription(),
                    throwable);
        }
    }

    private static void outputRollbackDeductResourceErrorLog(OrderSubmitContext context, RollbackDeductResourceResult rollbackResponse, Throwable throwable) {

        if (Objects.nonNull(throwable)) {
            log.error("订单扣减资源回滚异常, 资源类型：{}, 回滚结果:{}, error:{}", rollbackResponse.getResourceType(), rollbackResponse, throwable);
        }
    }

    /**
     * 汇总下单资源扣减结果
     *
     * @param context
     * @param completableFuture
     * @return
     */
    private static DeductResourceResult collectDeductFutureResult(OrderSubmitContext context, CompletableFuture<DeductResourceResult> completableFuture) {

        try {
            return completableFuture.get();
        } catch (Exception e) {
            log.error("{}请求扣减资源结果异常，异常：",context.getTraceId(), e);
        }
        return new DeductResourceResult().error("请求扣减资源结果异常");
    }

    /**
     * 汇总下单资源扣减回滚结果
     *
     * @param context           提交订单上下文
     * @param completableFuture
     * @return
     */
    private static RollbackDeductResourceResult collectRollbackFutureResult(OrderSubmitContext context, CompletableFuture<RollbackDeductResourceResult> completableFuture) {

        try {
            return completableFuture.get();
        } catch (Exception e) {
            log.error("{}获取订单扣减资源回退结果异常，异常：",context.getTraceId(), e);
        }
        return null;
    }


}
