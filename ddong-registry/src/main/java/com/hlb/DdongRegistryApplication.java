package com.hlb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Fly on 2019/3/31.
 */
@SpringBootApplication
@EnableEurekaServer
public class DdongRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(DdongRegistryApplication.class,args);
    }
}