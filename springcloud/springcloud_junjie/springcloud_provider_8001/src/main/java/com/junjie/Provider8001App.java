package com.junjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient   //eureka 客户端
@EnableDiscoveryClient
public class Provider8001App {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001App.class,args);
    }
}
