package com.quan.springboot;

import com.quan.springboot.bean.*;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
public class TestBindingBean {


    @Resource
    private User user;

    @Resource
    private CollectConfig collectConfig;







    @Resource(name = "getApp")
    private App app;


    @Resource
    private My my;


    @Resource
    private Person person;



    @Autowired
    private Environment environment;

    @Test
    public void doSome(){
        // 直接使用这个环境对象，来获取环境信息，配置信息等。
        String[] activeProfiles = environment.getActiveProfiles();
        for (String activeProfile : activeProfiles) {
            System.out.println(activeProfile);
        }

        // 获取配置信息
        String street = environment.getProperty("app.xyz.addr.street");
        System.out.println(street);
    }


    @Test
    public void testXml() {
        System.out.println(person);
    }

    @Test
    public void test(){
        System.out.println(my);
    }

    @Test
    public void testExternalBean() {
        System.out.println(app);
    }

    @Test
    public void testCollect() {
        System.out.println(collectConfig);
    }

    @Test
    public void testComplex() {
        System.out.println(user);
    }

}
