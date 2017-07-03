package com.loyalove.idea.order.exception;

import com.loyalove.idea.order.state.OrderState;

/**
 * Title: OrderStateException.java
 * Description: OrderStateException
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-04 17:17
 */
public class OrderStateException extends RuntimeException {

    private static final String msg = "订单不可操作，状态为：%s";

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public OrderStateException(OrderState orderState) {
        super(String.format(msg, orderState.getName()));
    }

}
