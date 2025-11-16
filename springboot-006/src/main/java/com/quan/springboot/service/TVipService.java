package com.quan.springboot.service;

import com.quan.springboot.domain.TVip;

public interface TVipService {

    /**
     * 根据id获取vip信息
     * @param id
     * @return Vip
     */
    TVip getVipById(Long id);


}
