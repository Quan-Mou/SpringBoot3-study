package com.quan.springboot.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quan.autoconfigure.MyService;
import com.quan.springboot.constant.StatuEnum;
import com.quan.springboot.entity.Vip;
import com.quan.springboot.result.R1;
import com.quan.springboot.result.R2;
import com.quan.springboot.service.VipService;
import jakarta.annotation.Resource;
import lombok.Getter;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/vip")
@RestController
public class VipController {

    @Autowired
    private MyService myService;

    @GetMapping("autoconfiguriton")
    public R1 autoconfiguriton(){
        myService.doSomething();
        return null;
    }




    @Resource
    private VipService vipService;


    /**
     * 根据id删除vip
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public R2<?> deleteById(@PathVariable("id") Long id) {
        int row = vipService.deleteById(id);
        if(row == 0) {
            return R2.fail(StatuEnum.DELETE.getMsg());
        }
        return R2.OK();
    }

    /**
     * 新增VIP信息
     * @param vip
     * @return
     */
    @PostMapping("/")
    public R2<?> InsertVip(@RequestBody Vip vip) {
        int row = vipService.insertVip(vip);
        if(row == 0) {
            return R2.fail(StatuEnum.INSERT.getMsg());
        }
        return R2.OK();
    }


    @PutMapping("/")
    public R2<?> updateVip(@RequestBody Vip vip) {
        int row = vipService.updateById(vip);
        if(row == 0) {
            return R2.fail(StatuEnum.INSERT.getMsg());
        }
        return R2.OK();
    }

    @GetMapping("/{id}")
    public Vip getVipById(@PathVariable("id") Long id) {
        Vip vip = vipService.getVipById(id);

        return vip;
    }






    /**
     * 统一响应格式
     * @param pageNO
     * @return
     */
    @GetMapping("/list/{pageNO}")
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
