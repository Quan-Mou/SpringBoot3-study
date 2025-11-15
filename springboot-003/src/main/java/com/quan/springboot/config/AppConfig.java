package com.quan.springboot.config;


import com.quan.springboot.bean.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean()
//    @ConfigurationProperties(prefix = "my")
    public User getUser() {
        return new User();
    }


}
