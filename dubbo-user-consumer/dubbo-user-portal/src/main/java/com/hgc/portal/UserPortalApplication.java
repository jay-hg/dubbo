package com.hgc.portal;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.hgc")
@DubboComponentScan(basePackages = "com.hgc")
public class UserPortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserPortalApplication.class, args);
    }
}
