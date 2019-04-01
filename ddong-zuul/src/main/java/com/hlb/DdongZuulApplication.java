package com.hlb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Fly on 2019/3/31.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class DdongZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(DdongZuulApplication.class, args);
    }
}