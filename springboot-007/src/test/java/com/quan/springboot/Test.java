package com.quan.springboot;

import com.quan.springboot.bean.A;
import com.quan.springboot.bean.B;
import jakarta.annotation.Resource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test {


    @Resource
    private A a;

    @Resource
    private B b;

    @org.junit.jupiter.api.Test
    public void test() {
        System.out.println(a);
    }

}
