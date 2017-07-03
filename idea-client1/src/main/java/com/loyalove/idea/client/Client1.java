package com.loyalove.idea.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Title: Server.java
 * Description: Server
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-08 17:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Client1 {
    public static void main(String[] args) {
        SpringApplication.run(Client1.class, args);
    }
}


