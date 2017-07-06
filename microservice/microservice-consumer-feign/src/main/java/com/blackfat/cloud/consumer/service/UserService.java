package com.blackfat.cloud.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangfeiyang
 * @desc
 * @create 2017/7/6-16:37
 */
@FeignClient("base-service")
public interface UserService {

    @RequestMapping(value = "/users/")
    String  getUser();
}
