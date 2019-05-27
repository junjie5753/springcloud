package com.junjie;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer  //进去eureka服务注解
public class Eureka7001App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001App.class,args);
    }
}
