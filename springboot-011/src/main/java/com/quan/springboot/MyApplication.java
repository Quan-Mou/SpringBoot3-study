package com.quan.springboot;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.context.WebApplicationContext;

        @SpringBootApplication
        @Slf4j
        //@MapperScan(basePackages = {"com.quan.springboot.mapper"})
        public class MyApplication extends SpringBootServletInitializer {

            @Override
            protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
                return builder.sources(MyApplication.class);
            }

            public static void main(String[] args) {
        //        1.
        //        SpringApplication springApplication = new SpringApplication(MyApplication.class);
        //        springApplication.setBannerMode(Banner.Mode.OFF);
        //        springApplication.run(args);
        //        2.
                new SpringApplicationBuilder(MyApplication.class).bannerMode(Banner.Mode.LOG).run(args);
                log.trace("这是trace级别的日志信息");
                log.debug("这是debug级别的日志信息");
                log.info("这是info级别的日志信息");
                log.warn("这是warn级别的日志信息");
                log.error("这是error级别的日志信息");

            }
        }
