package com.hgc.portal.Config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.hgc.provider.user.UserProviderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {
    @Value("${dubbo.application}")
    private String applicationName;

    @Value("${dubbo.registry}")
    private String registry;

    @Bean
    public ApplicationConfig applicationConfig() {
        System.out.println("hello world!");
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(applicationName);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(registry);
//        registryConfig.setClient("curator");
        return registryConfig;
    }
}
