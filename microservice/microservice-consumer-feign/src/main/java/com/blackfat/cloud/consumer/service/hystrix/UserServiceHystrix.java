package com.blackfat.cloud.consumer.service.hystrix;

import com.blackfat.cloud.consumer.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author wangfeiyang
 * @desc
 * @create 2018/12/20-14:22
 */
@Component
public class UserServiceHystrix implements UserService {
    @Override
    public String getUser() {
        return "getUser hystrix";
    }
}
