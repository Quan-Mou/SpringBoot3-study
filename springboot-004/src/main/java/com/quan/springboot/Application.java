package com.quan.springboot;

import com.quan.springboot.entity.Vip;
import com.quan.springboot.repository.VipMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = {"com.quan.springboot.repository"})
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        VipMapper vipMapper = context.getBean("vipMapper", VipMapper.class);
        Vip vip = vipMapper.selectById(2L);
        System.out.println(vip);
    }

}
