package com.quan.springboot.controller;

import com.quan.springboot.domain.TVip;
import com.quan.springboot.service.TVipService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vip")
public class VipController {


    @Resource
    private TVipService tVipService;

    @GetMapping("/{id}")
   public TVip  getVipById(@PathVariable("id") Long id) {
       return tVipService.getVipById(id);
   }

}
