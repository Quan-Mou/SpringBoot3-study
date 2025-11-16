package com.quan.springboot.service.impl;

import com.quan.springboot.domain.TVip;
import com.quan.springboot.mapper.TVipDao;
import com.quan.springboot.service.TVipService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TVipServiceImpl implements TVipService {

    @Resource
    private TVipDao tVipDao;

    @Override
    public TVip getVipById(Long id) {
        return tVipDao.selectByPrimaryKey(id);
    }
}
