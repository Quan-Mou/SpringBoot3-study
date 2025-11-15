package com.quan.springboot.mapper.impl;

import com.quan.springboot.mapper.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapperImpl implements UserMapper {
    @Override
    public void save() {
        System.out.println("正在保存用户信息...");
    }
}
