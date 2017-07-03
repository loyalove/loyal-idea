package com.loyalove.idea.order.state;

import com.loyalove.idea.order.context.OrderContext;

/**
 * Title: OrderedState.java
 * Description: OrderedState
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-04 17:11
 */
public class OrderedState extends OrderState {

    public static final String STATE_NAME = "已预订";

    public String getName() {
        return STATE_NAME;
    }

    /**
     * 确认订单
     *
     * @param orderContext
     */
    public void confirm(OrderContext orderContext) {
        System.out.println("进行订单确认操作");
        System.out.println("订单已确认");
    }

}
