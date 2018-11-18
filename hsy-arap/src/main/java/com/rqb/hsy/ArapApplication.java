package com.rqb.hsy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ArapApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ArapApplication.class,args);
    }
}
