package com.hlb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Fly on 2019/3/31.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DdongItemServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DdongItemServiceApplication.class, args);
    }
}