package com.zrar.easyweb.dubbo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class DubboConsumerStarter {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerStarter.class, args);
    }

}
