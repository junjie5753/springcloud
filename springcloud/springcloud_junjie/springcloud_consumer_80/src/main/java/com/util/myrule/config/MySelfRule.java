package com.util.myrule.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new MyRandomRule();
    }

}
