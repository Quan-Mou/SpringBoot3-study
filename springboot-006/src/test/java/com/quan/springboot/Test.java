package com.quan.springboot;

import com.quan.springboot.domain.TVip;
import com.quan.springboot.mapper.TVipDao;
import jakarta.annotation.Resource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test {

    @Resource
    private TVipDao tVipDao;

    @org.junit.jupiter.api.Test
    public void test() {
        TVip tVip = tVipDao.selectByPrimaryKey(1L);
        System.out.println(tVip);

        TVip wangwu  = new TVip(null, "王五", "1222322211", "2028-10-11");
        System.out.println(tVipDao.insert(wangwu) == 1 ? "新增成功":"新增失败");

        System.out.println(tVipDao.selectByPrimaryKey(3L));


    }
}
