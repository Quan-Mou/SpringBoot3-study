package com.quan.springboot.service.impl;

import com.quan.springboot.mapper.UserMapper;
import com.quan.springboot.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void save() {
        userMapper.save();
    }
}
