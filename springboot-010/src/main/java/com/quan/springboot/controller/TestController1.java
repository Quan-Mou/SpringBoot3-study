package com.quan.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController1 {

    @GetMapping("nullPoint1")
    public String nullPoint() {

        String a = null;
        a.toString();

        return "ok";
    }
    @ExceptionHandler(NullPointerException.class)
    public String nullPointHandler(Exception e) {
        return e.getMessage();
    }


}
