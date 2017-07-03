package com.loyalove.idea.order.state;

import com.loyalove.idea.order.context.OrderContext;
import com.loyalove.idea.order.exception.OrderStateException;

/**
 * Title: OrderState.java
 * Description: OrderState
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-04 16:57
 */
public abstract class OrderState {

    public static final String STATE_NAME = "未命名订单状态";

    public abstract String getName();

    /**
     * 确认订单
     *
     * @param orderContext
     */
    public void confirm(OrderContext orderContext) {
        throw new OrderStateException(this);
    }

    /**
     * 修改订单
     *
     * @param orderContext
     */
    public void modify(OrderContext orderContext) {
        throw new OrderStateException(this);
    }

    /**
     * 支付
     *
     * @param orderContext
     */
    public void pay(OrderContext orderContext) {
        throw new OrderStateException(this);
    }

    /**
     * 完成
     *
     * @param orderContext
     */
    public void finish(OrderContext orderContext) {
        throw new OrderStateException(this);
    }
}
