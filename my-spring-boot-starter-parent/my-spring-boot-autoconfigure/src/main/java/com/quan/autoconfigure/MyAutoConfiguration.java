package com.quan.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

//@Configuration  // 标识为配置类
@AutoConfiguration // Spring Boot 3 推荐使用 @AutoConfiguration 而不是 @Configuration
@EnableConfigurationProperties(MyProperties.class)  // 启用配置属性
@ConditionalOnClass(MyService.class)  // 存在 MyService 类时才生效
@ConditionalOnProperty(prefix = "my.starter", name = "enabled", 
                      havingValue = "true", matchIfMissing = true)
public class MyAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    public MyService myService(MyProperties myProperties) {
        return new MyService(myProperties);
    }




//
//    private final MyProperties properties;
//
//    public MyAutoConfiguration(MyProperties properties) {
//        this.properties = properties;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean  // 用户自定义时则不创建
//    @ConditionalOnProperty(prefix = "my.starter", name = "service-enabled",
//                          havingValue = "true", matchIfMissing = true)
//    public MyService myService() {
//        return new MyService(properties);
//    }
//
//    // 条件化创建其他 Bean
//    @Bean
//    @ConditionalOnBean(MyService.class)
//    @ConditionalOnProperty(prefix = "my.starter.cache", name = "enabled",
//                          havingValue = "true")
//    public MyCacheManager cacheManager(MyService myService) {
//        return new MyCacheManager(properties.getCache(), myService);
//    }
//
//    // 内部辅助类
//    static class MyCacheManager {
//        public MyCacheManager(MyProperties.Cache cache, MyService service) {
//            // 缓存管理逻辑...
//        }
//    }
}