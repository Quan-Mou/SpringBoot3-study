package com.quan.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {

    @GetMapping("/templateTest")
    public String templateTest() {
        String s = null;
        s.toString();
        return "ok";
    }


}
