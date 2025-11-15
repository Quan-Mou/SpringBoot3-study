package com.quan.springboot;


import com.quan.springboot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableConfigurationProperties(User.class)
@ConfigurationPropertiesScan(basePackages = {"com.quan.springboot.bean"})
@ImportResource(locations = {"classpath:beans.xml"})
public class MyApplication {


    public static void main(String[] args) {
//       这个args是从命令行启动时传入的参数数组
        SpringApplication.run(MyApplication.class,args);
    }


}
