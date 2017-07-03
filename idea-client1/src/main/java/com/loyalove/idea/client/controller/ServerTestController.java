package com.loyalove.idea.client.controller;

import com.loyalove.idea.client.po.UserPO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class ServerTestController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public UserPO index(String msg) {
        UserPO userPO = new UserPO();
        userPO.setUsername("loyal");
        userPO.setPassword(msg);
        return userPO;
    }
}