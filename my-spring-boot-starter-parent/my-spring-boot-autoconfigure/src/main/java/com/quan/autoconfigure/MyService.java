package com.quan.autoconfigure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyService {
    
    private static final Logger logger = LoggerFactory.getLogger(MyService.class);
    
    private final MyProperties properties;
    
    public MyService(MyProperties properties) {
        this.properties = properties;
        logger.info("MyService 初始化成功: name={}, timeout={}", 
                   properties.getName(), properties.getTimeout());
    }
    
    public String process(String input) {
        logger.info("处理请求: {}", input);
        return String.format("Processed by %s: %s", 
                           properties.getName(), input);
    }
    
    public void doSomething() {
        logger.info("执行核心业务逻辑，超时时间: {}ms", properties.getTimeout());
        // 实际业务逻辑...
    }
    
    public MyProperties getProperties() {
        return properties;
    }
}