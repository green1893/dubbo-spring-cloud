package com.zrar.easyweb.dubbo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Dubbo服务提供模拟实现
 *
 * @author zhaozw
 */
@SpringBootApplication
public class DubboProviderStarter {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderStarter.class, args);
    }


}
