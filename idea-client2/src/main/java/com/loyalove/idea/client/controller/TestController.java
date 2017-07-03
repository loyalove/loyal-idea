package com.loyalove.idea.client.controller;

import com.loyalove.idea.client.service.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: TestController.java
 * Description: TestController
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-09 11:49
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ServiceClient serviceClient;

    @RequestMapping("")
    public Object test(String msg) {
        return serviceClient.index(msg);
    }
}