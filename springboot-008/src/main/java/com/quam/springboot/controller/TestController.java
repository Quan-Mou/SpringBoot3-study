package com.quam.springboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    @GetMapping("/test2")
    public String test2() {
        return "test2";
    }

    @GetMapping("/test3")
    public String test3() {
        return "test3";
    }


//    @GetMapping("/{path:[a-z]+}/**/*.do")
    @GetMapping("/{path:[a-z]+}/a?/**/*.do")
        public String pathPatternParser(@PathVariable("path") String path, HttpServletRequest request) {
            return request.getRequestURI()  + "：path = "+ path;
    }



}
