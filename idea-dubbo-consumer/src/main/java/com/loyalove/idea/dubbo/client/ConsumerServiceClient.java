package com.loyalove.idea.dubbo.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.loyalove.idea.dubbo.service.ProviderService;
import org.springframework.stereotype.Component;

/**
 * Title: ConsumerServiceClient.java
 * Description: TODO
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2018-01-29 14:22
 */
@Component
public class ConsumerServiceClient {

  @Reference(url = "dubbo://127.0.0.1:20800")
  private ProviderService providerService;

  public String test(String msg) {
    return providerService.test(msg);
  }
}
