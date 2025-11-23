package com.quan.springboot.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quan.springboot.entity.Vip;
import com.quan.springboot.result.R1;
import com.quan.springboot.service.VipService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VipController {


    @Resource
    private VipService vipService;

    /**
     * 统一响应格式
     * @param pageNO
     * @return
     */
    @GetMapping("/vip/list/{pageNO}")
    public R1<PageInfo<Vip>> list(@PathVariable("pageNO") Integer pageNO) {
        PageHelper.startPage(pageNO,2);
        List<Vip> vips = vipService.list();
        PageInfo<Vip> vipPageInfo = new PageInfo<>(vips);
        return R1.OK(vipPageInfo);
    }

//    @GetMapping("/vip/list/{pageNO}")
//    public PageInfo<Vip> list(@PathVariable("pageNO") Integer pageNO) {
//        PageHelper.startPage(pageNO,2);
//        List<Vip> vips = vipService.list();
////       把数据封装到PageInfo
//        PageInfo<Vip> vipPageInfo = new PageInfo<>(vips);
//        return vipPageInfo;
//    }




}
