package com.quan.springboot.mapper;

import com.quan.springboot.domain.TVip;
import org.springframework.stereotype.Repository;

@Repository
public interface TVipDao {
    int deleteByPrimaryKey(Long id);

    int insert(TVip record);

    int insertSelective(TVip record);

    TVip selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TVip record);

    int updateByPrimaryKey(TVip record);
}