package com.lgy.future.service.task;

import com.lgy.future.domain.OrderSubmitContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultCheckSellerRuleService implements TaskHandler {

    @Override
    public TaskResult execute(OrderSubmitContext context) {
        log.info("校验卖家规则通过");
        return TaskResult.success();
    }

    @Override
    public boolean complete(TaskResult taskResult, Throwable t) {
        if (t != null) {
            return false;
        }

        return taskResult.isSuccess();
    }
}
