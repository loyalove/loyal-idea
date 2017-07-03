package com.loyalove.idea.order.context;

import com.loyalove.idea.order.exception.OrderStateException;
import com.loyalove.idea.order.pojo.OrderDO;
import com.loyalove.idea.order.state.OrderState;
import com.loyalove.idea.order.util.OrderUtil;

/**
 * Title: OrderContext.java
 * Description: OrderContext
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-04 16:55
 */
public class OrderContext {
    private OrderDO orderDO;
    private OrderState orderState;

    public OrderContext(OrderDO orderDO) {
        this.orderDO = orderDO;
        this.orderState = OrderUtil.getOrderState(orderDO.getState());
    }

    /**
     * 确认订单
     *
     */
    public void confirm() {
        System.out.println("开始确认订单");
        try {
            orderState.confirm(this);
        }catch (OrderStateException e){
            System.out.println(e.getMessage());
        }

    }

    /**
     * 修改订单
     *
     */
    public void modify() {
        System.out.println("开始修改订单");
        try {
            orderState.modify(this);
        }catch (OrderStateException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * 支付
     *
     */
    public void pay() {
        System.out.println("开始支付订单");
        try {
            orderState.pay(this);
        }catch (OrderStateException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * 完成
     *
     */
    public void finish() {
        System.out.println("开始完成订单");
        try {
            orderState.finish(this);
        }catch (OrderStateException e){
            System.out.println(e.getMessage());
        }
    }
}
