package com.junjie;

import com.util.myrule.config.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD8001",configuration= MySelfRule.class) //ribbon算法 随机
public class springcloud_consumer80App {
    public static void main(String[] args) {
        SpringApplication.run(springcloud_consumer80App.class,args);
    }
}
