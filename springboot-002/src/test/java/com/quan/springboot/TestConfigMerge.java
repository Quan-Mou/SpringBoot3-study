package com.quan.springboot;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestConfigMerge {


    @Value("${spring.datasource.username:没有获取到数据}")
    private String mysqlUserName;

    @Value("${spring.data.redis.host:没有获取到数据}")
    private String redisHost;
    @Test
    public void test() {
        System.out.println("mysqlUserName:" + mysqlUserName);
        System.out.println("redisHost:" + redisHost);
    }

}
