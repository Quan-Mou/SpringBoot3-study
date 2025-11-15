package com.quan.springboot;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMultipleEnvironmentConfig {


    @Value("${userinfo.name:没有获取到数据}")
    public String name;


    @Test
    public void test() {
        System.out.println("不用环境下的配置name：" + name);
    }


}
