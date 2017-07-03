package com.loyalove.idea.order.context;

import com.loyalove.idea.order.pojo.OrderDO;
import org.junit.Before;
import org.junit.Test;

/**
 * Title: OrderContextTest.java
 * Description: OrderContextTest
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-04 18:04
 */
public class OrderContextTest {

    OrderContext orderContext;
    OrderDO orderDO;

    @Before
    public void init(){
        orderDO = new OrderDO();
        orderDO.setOrderNo("10001");
        orderDO.setState("CONFIRM");
        orderDO.setType("PAY_ONLINE");
        orderContext = new OrderContext(orderDO);
    }

    @Test
    public void confirm(){
        orderContext.confirm();
    }

    @Test
    public void modify(){
        orderContext.modify();
    }

    @Test
    public void pay(){
        orderContext.pay();
    }

    @Test
    public void finish(){
        orderContext.finish();
    }
}