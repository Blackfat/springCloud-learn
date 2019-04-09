package com.blackfat.cloud.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangfeiyang
 * @desc
 * @create 2017/7/7-9:43
 */
@Service
public class UserService {


    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "userFallBack")
    public String  getUser(){
        return restTemplate.getForEntity("http://micro-base-service/users/",String.class).getBody();
    }


    public String userFallBack(){
        return "error";
    }
}
