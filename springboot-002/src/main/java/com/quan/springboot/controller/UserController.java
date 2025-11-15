package com.quan.springboot.controller;


import com.quan.springboot.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    @Value("${userinfo.name}")
    private String name;

    @Value("${userinfo.age}")
    private Integer age;

    @Value("${userinfo.addr:中国}")
    private String addr;

    @Value("${app.name}")
    String name1;

    @Value("${app.version}")
    String v;

    @GetMapping("/save")
    public String saveUser() {
        userService.save();
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("addr:" + addr);
        System.out.println("appName:" + name1);
        System.out.println("appVersion:" + v);
        return "success";
    }


}
