package com.blackfat.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangfeiyang
 * @desc
 * @create 2017/7/6-11:42
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BaseProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseProviderApplication.class,args);
    }

}
