package com.quan.springboot.config;


import com.quan.springboot.bean.App;
import com.quan.springboot.bean.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean()
    @ConfigurationProperties(prefix = "app")
    public App getApp() {
        return new App();
    }
}
