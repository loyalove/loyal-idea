package com.loyalove.idea.client.service;

import com.loyalove.idea.pojo.po.UserPO;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Title: ServiceClient.java
 * Description: ServiceClient
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-09 11:37
 */
@FeignClient(name = "cloud-server")
public interface ServiceClient {
    @RequestMapping(method = RequestMethod.GET, value = "/test/index")
    UserPO index(@RequestParam("msg") String msg);
}
