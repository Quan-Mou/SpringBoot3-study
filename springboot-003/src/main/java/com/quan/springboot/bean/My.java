package com.quan.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "group")
@PropertySource("classpath:c/test.yaml")
public class My {
    private String name;

    public void setName(String myName) {
        this.name = myName;
    }

    @Override
    public String toString() {
        return "My{" +
                "name='" + name + '\'' +
                '}';
    }
}
