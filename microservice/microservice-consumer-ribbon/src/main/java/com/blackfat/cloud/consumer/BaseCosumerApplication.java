package com.blackfat.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangfeiyang
 * @desc
 * @create 2017/7/6-14:12
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BaseCosumerApplication {

    @Bean
    // 开启客户端负载均衡
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(BaseCosumerApplication.class,args);
    }
}
