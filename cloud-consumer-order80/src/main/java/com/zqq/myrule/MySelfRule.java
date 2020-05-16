package com.zqq.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon负载均衡选择服务调用配置
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RoundRobinRule();//定义为轮询机制
    }

//    @Bean
//    public IRule myRule(){
//        return new RandomRule();//定义为随机机制
//    }
}
