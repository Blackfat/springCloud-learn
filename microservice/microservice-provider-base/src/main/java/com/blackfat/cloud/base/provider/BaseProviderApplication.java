package com.blackfat.cloud.base.provider;

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
/*
*Eureka-Client 向 Eureka-Server 发起注册应用实例成功后获得租约 ( Lease )。
* Eureka-Client 固定间隔向 Eureka-Server 发起续租( renew )，避免租约过期。
*
*默认情况下，租约有效期为 90 秒，续租频率为 30 秒。两者比例为 1 : 3 ，保证在网络异常等情况下，有三次重试的机会。
* */
public class BaseProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseProviderApplication.class,args);
    }

}
