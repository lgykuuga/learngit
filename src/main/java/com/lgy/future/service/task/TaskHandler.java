package com.lgy.future.service.task;

import com.lgy.future.domain.OrderSubmitContext;

/**
 * calculate 系统任务处理器抽闲类
 * 植入扩展点，
 *
 */
public interface TaskHandler {

    /**
     * 任务执行
     * @param context 提交订单上下文
     * @return 任务执行结果
     */
    TaskResult execute(OrderSubmitContext context);


    boolean complete(TaskResult taskResult, Throwable t);

}
