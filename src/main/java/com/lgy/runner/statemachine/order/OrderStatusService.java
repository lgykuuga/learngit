package com.lgy.runner.statemachine.order;

import java.util.*;

public class OrderStatusService {
    /**
     * 映射关系列表
     */
    public  static List<OrderStatusMapper> mapperList = new ArrayList<OrderStatusMapper>();

    static {
        /**
         * 初始化判断项、订单动作到状态的映射，这里只为演示，实际中映射关系最好保存在配置文件中或者数据库中，
         * 一般在应用启动的时候，从配置文件或者数据库加载，保存一份即可。
         *
         */
        OrderStatusMapper m1 = new OrderStatusMapper();
        m1.addJudgementItems(1,2,4,6) //先吃后付 and 自动接单 and 有打印机 and 打印成功
                .addAction2statusItem(1,6)//下单动作:进行中
                .addAction2statusItem(7, 4); //结账动作:已完成

        OrderStatusMapper m2 = new OrderStatusMapper();
        m2.addJudgementItems(3,5)
                .addAction2statusItem(2,1)
                .addAction2statusItem(4, 3);

        mapperList.add(m1);
        mapperList.add(m2);

    }

    /**
     * 是否是相等的set
     * @param source
     * @param dest
     * @return
     */
    public boolean  isEqualSet(Set<Integer> source, Set<Integer> dest){
        if(null == source || null == dest){
            return false;
        }
        if(source.size() != dest.size()){
            return false;
        }
        for(Iterator<Integer> it = source.iterator(); it.hasNext();){
            if(!dest.contains(it.next())){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderAction(1);//下单
        order.setJudgementItems(new HashSet<Integer>(Arrays.asList(1,2,4,6)));//先吃后付 and 自动接单 and 有打印机 and 打印成功
        //获取订单下一个状态
        System.out.println(new OrderStatusService().getNextOrderStatus(order));//  结果为 6(进行中)
    }
    /**
     * 获取下一个订单状态
     * @param curOrder
     * @return
     */
    public Integer getNextOrderStatus(Order curOrder){
        for(OrderStatusMapper mapper : mapperList){
            if(isEqualSet(curOrder.getJudgementItems(), mapper.getJudgementItems()) &&  null != curOrder.getOrderAction()){
                return mapper.getAction2statusMap().get(curOrder.getOrderAction());
            }
        }
        return null;
    }

}

/**
 * 订单类型，订单动作到状态的映射。
 *
 */
class OrderStatusMapper{

    /**
     * 判断项
     */
    private Set<Integer> judgementItems = new HashSet<Integer>();

    /**
     * 订单动作到状态关系
     */
    private Map<Integer,Integer> action2statusMap = new HashMap<Integer,Integer>();

    /**
     * 下一个订单状态
     */
    private Integer nextStatus;


    public Set<Integer> getJudgementItems() {
        return judgementItems;
    }

    public OrderStatusMapper addJudgementItems(Integer ...items) {
        if(null == items || items.length <= 0){
            return this;
        }
        for(Integer cur : items){
            this.judgementItems.add(cur);
        }
        return this;
    }



    public Map<Integer, Integer> getAction2statusMap() {
        return action2statusMap;
    }

    public OrderStatusMapper addAction2statusItem(Integer action,Integer status) {
        if(null == action || null == status){
            return this;
        }
        this.action2statusMap.put(action, status);
        return this;
    }

    public Integer getNextStatus() {
        return nextStatus;
    }

    public OrderStatusMapper setNextStatus(Integer nextStatus) {
        this.nextStatus = nextStatus;
        return this;
    }
}


class Order{
    /**
     * 判断项目
     * 1:商家开启先食后付;
     * 2:自动接单;
     * 3:不自动接单
     * 4:有打印机
     * 5:没有打印机
     * 6:打印成功
     * 7:打印不成功
     * 8:自动清台
     * 9:不自动清台
     */
    private Set<Integer> judgementItems;

    /**
     * 订单动作
     * 1:下单
     * 2:接单
     * 3:拒单
     * 4:顾客取消单
     * 5:顾客支付
     * 6:清台
     * 7:结账
     */
    private Integer orderAction;

    /**
     * 订单状态
     * 1:待确认
     * 2:待处理
     * 3:拒绝
     * 4:完成
     * 5:取消
     * 6:进行中
     * 7:超时
     * 8:申请退款
     */
    private Integer orderStatus;


    public Set<Integer> getJudgementItems() {
        return judgementItems;
    }

    public void setJudgementItems(Set<Integer> judgementItems) {
        this.judgementItems = judgementItems;
    }

    public Integer getOrderAction() {
        return orderAction;
    }

    public void setOrderAction(Integer orderAction) {
        this.orderAction = orderAction;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }


}
