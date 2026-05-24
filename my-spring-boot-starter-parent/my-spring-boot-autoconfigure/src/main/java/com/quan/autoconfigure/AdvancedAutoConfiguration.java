//package com.quan.autoconfigure;
//
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.boot.autoconfigure.AutoConfigureBefore;
//import org.springframework.boot.autoconfigure.condition.*;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.system.JavaVersion;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//@ConditionalOnClass({DataSource.class, MyService.class})
//@ConditionalOnMissingBean(type = "com.example.MyAlternativeService")
//@ConditionalOnExpression("'${my.starter.mode}'.equals('advanced')")
//@AutoConfigureAfter(DataSourceAutoConfiguration.class)
//@AutoConfigureBefore(SomeOtherAutoConfiguration.class)
//public class AdvancedAutoConfiguration {
//
//    @Bean
//    @ConditionalOnWebApplication  // Web 应用环境下
//    @ConditionalOnResource(resources = "classpath:my-config.xml")  // 存在资源文件
//    public MyWebService myWebService() {
//        return new MyWebService();
//    }
//
//    @Bean
//    @ConditionalOnMissingClass("com.example.OptionalDependency")
//    @ConditionalOnJava(JavaVersion.EIGHT)  // Java 8 环境
//    public MyFallbackService fallbackService() {
//        return new MyFallbackService();
//    }
//}