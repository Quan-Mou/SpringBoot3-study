package com.quan.springboot.service.impl;

import com.quan.springboot.entity.Vip;
import com.quan.springboot.mapper.VipMapper;
import com.quan.springboot.service.VipService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipServiceImpl implements VipService {


    @Resource
    private VipMapper vipMapper;

    @Override
    public List<Vip> list() {
        List<Vip> vips = vipMapper.list();
        return vips;
    }
}
