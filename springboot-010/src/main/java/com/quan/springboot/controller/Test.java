package com.quan.springboot.controller;

import com.quan.springboot.exception.NotFindException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {


    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/illegalArg")
    public String illegalArgument(@RequestParam(defaultValue = "-1") int id) {
        if (id < 0) {
            throw new IllegalArgumentException("ID 不能为负数: " + id);
        }
        return "OK";
    }

    @GetMapping("/divideByZero")
    public String divideByZero() {

        int result = 10 / 0; // 触发除零异常
        return "Result: " + result;
    }

    @GetMapping("/notFound")
    public String notFound() {
        if (1 == 1) {
            throw new NotFindException("找不到资源");
        }
        return "User found";
    }
}
