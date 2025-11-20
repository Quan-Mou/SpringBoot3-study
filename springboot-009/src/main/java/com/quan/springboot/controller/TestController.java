package com.quan.springboot.controller;


import com.quan.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @ResponseBody
    @GetMapping("user/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        return new User(id,"张三",100);
    }

//    @GetMapping(value = "testYaml/{id}",produces = {"application/yaml"})
    @GetMapping(value = "testYaml/{id}")
    @ResponseBody
    public User testYamlFormat(@PathVariable("id") Integer id ) {
        return new User(id,"王五",200);
    }
}
