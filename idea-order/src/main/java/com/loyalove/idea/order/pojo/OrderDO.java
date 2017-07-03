package com.loyalove.idea.order.pojo;

import java.io.Serializable;

/**
 * Title: OrderDO.java
 * Description: OrderDO
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-04 16:55
 */
public class OrderDO implements Serializable{

    private static final long serialVersionUID = 276710601535690843L;
    private String orderId;
    private String orderNo;
    private String state;
    private String type;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
