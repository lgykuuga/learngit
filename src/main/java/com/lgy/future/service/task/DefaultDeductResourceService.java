package com.lgy.future.service.task;

import com.lgy.future.domain.OrderSubmitContext;
import com.lgy.future.exception.BuyException;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class DefaultDeductResourceService implements TaskHandler {

    @Override
    public TaskResult execute(OrderSubmitContext context) {
        if (new Random().nextInt()%2>=0) {
            throw new BuyException("300", "哈哈哈哈");
        }
        log.info("扣减资源成功");
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
