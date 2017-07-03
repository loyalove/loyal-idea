package com.loyalove.idea.order.state;

import com.loyalove.idea.order.context.OrderContext;

/**
 * Title: ConfirmState.java
 * Description: ConfirmState
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-04 17:11
 */
public class ConfirmState extends OrderState {

    public static final String STATE_NAME = "已确认";

    public String getName() {
        return STATE_NAME;
    }

    /**
     * 修改订单
     *
     * @param orderContext
     */
    public void modify(OrderContext orderContext) {
        System.out.println("进行订单修改操作");
        System.out.println("订单已修改");
    }

    /**
     * 支付
     *
     * @param orderContext
     */
    public void pay(OrderContext orderContext) {
        System.out.println("进行订单支付操作");
        System.out.println("订单已支付");
    }

}
