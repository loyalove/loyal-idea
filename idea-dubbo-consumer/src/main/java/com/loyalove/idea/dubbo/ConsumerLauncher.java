package com.loyalove.idea.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.loyalove.idea.dubbo.client.ConsumerServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: ConsumerLauncher.java
 * Description: TODO
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2018-01-29 14:08
 */
@SpringBootApplication
@EnableDubboConfiguration
@DubboComponentScan("com.loyalove.idea.dubbo.client")
@RestController
public class ConsumerLauncher {

  @Autowired
  private ConsumerServiceClient consumerServiceClient;

  @GetMapping("/")
  public String test(String msg){
    return consumerServiceClient.test(msg);
  }

  public static void main(String[] args) {
    SpringApplication.run(ConsumerLauncher.class, args);
  }
}
