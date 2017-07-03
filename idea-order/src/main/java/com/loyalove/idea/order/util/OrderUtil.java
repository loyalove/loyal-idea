package com.loyalove.idea.order.util;

import com.loyalove.idea.order.state.ConfirmState;
import com.loyalove.idea.order.state.OrderState;
import com.loyalove.idea.order.state.OrderedState;

/**
 * Title: OrderUtil.java
 * Description: OrderUtil
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-04 17:06
 */
public class OrderUtil {
    public static OrderState getOrderState(String orderState) {
        if ("INIT".equals(orderState)) {
            return new OrderedState();
        } else if ("CONFIRM".equals(orderState)) {
            return new ConfirmState();
        } else {
            return new OrderedState();
        }
    }
}
