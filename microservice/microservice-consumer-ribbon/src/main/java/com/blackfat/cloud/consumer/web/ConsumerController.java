package com.blackfat.cloud.consumer.web;

import com.blackfat.cloud.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangfeiyang
 * @desc
 * @create 2017/7/6-14:34
 */
@RestController
public class ConsumerController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "consumer-ribbon")
    public String baseConsumer(){
        return userService.getUser();
    }





}
