package com.junjie;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


//集群注意映射地址
@SpringBootApplication
@EnableEurekaServer  //进去eureka服务注解
public class Eureka7003App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7003App.class,args);
    }
}
