package com.loyalove.idea.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.loyalove.idea.dubbo.service.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Title: ProviderServiceImpl.java
 * Description: TODO
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2018-01-29 14:18
 */
@Component
@Service(interfaceClass = ProviderService.class)
public class ProviderServiceImpl implements ProviderService {

  private static final Logger logger = LoggerFactory.getLogger(ProviderServiceImpl.class);

  @Override
  public String test(String msg) {
    logger.info(msg);
    return String.format("Hello, %s",msg);
  }
}
