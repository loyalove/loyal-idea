package com.loyalove.idea.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Title: Server.java
 * Description: Server
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-08 17:57
 */
@SpringBootApplication
@EnableEurekaServer
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }
}
