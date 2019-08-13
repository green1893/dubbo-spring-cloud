package com.zrar.easyweb.dubbo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhaozw
 */
@EnableEurekaServer
@SpringBootApplication
public class DubboRegistryStarter {

    public static void main(String[] args) {
        SpringApplication.run(DubboRegistryStarter.class, args);
    }

}
