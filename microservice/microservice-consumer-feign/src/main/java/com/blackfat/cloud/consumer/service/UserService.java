package com.blackfat.cloud.consumer.service;

import com.blackfat.cloud.consumer.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangfeiyang
 * @desc
 * @create 2017/7/6-16:37
 */
@FeignClient(value = "micro-base-service",fallback = UserServiceHystrix.class)
public interface UserService {

    @RequestMapping(value = "/users/")
    String  getUser();
}
