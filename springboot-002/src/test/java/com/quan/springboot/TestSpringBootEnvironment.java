package com.quan.springboot;

import com.quan.springboot.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestSpringBootEnvironment {

    @Resource
    private UserService userService;


    @Value("${app.name}")
    String name;

    @Value("${app.version}")
    String v;

    @org.junit.jupiter.api.Test
    public void test() {
        userService.save();
        System.out.println("appName:" + name);
        System.out.println("appVersion:" + v);
    }

}
