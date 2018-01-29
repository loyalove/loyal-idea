package com.loyalove.idea.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Title: com.loyalove.idea.dubbo.ProviderLauncher.java
 * Description: TODO
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2018-01-29 14:06
 */
@SpringBootApplication
@EnableDubboConfiguration
@DubboComponentScan("com.loyalove.idea.dubbo.service")
public class ProviderLauncher {

  private static final Logger logger = LoggerFactory.getLogger(ProviderLauncher.class);

  private static final int MILLIS = 1000 * 60 * 60 * 24;

  public static void main(String[] args) {
    SpringApplication.run(ProviderLauncher.class, args);
    try {
      while (true) {
        Thread.sleep(MILLIS);
      }
    } catch (InterruptedException e) {
      logger.error("系统异常");
    }
  }

}
