package com.rqb.hsy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 在启动类上添加@EnableDiscoveryClient（使得注册中心发现该服务），
 * 添加@EnableFeignClients，声明是一个Feign的客户端。
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SalesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalesApplication.class,args);
    }

}
