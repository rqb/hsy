package com.rqb.hsy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterCenter
{
    public static void main(String[] args )
    {
        SpringApplication.run(RegisterCenter.class,args);
    }
}
