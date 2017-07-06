package com.blackfat.cloud.consumer.web;

import com.blackfat.cloud.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangfeiyang
 * @desc
 * @create 2017/7/6-16:22
 */

@RestController
public class ConsumerController {

     @Autowired
     private UserService userService;


    @RequestMapping(value = "consumer-feign")
    public String baseConsumer(){
      return userService.getUser();
    }

}
