package com.quan.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my.starter")
@Getter
@Setter
public class MyProperties {
    
    /**
     * 是否启用 Starter
     */
    private boolean enabled = true;
    
    /**
     * 服务名称
     */
    private String name = "default-service";
    
    /**
     * 超时时间（毫秒）
     */
    private int timeout = 3000;
    
    /**
     * 缓存配置
     */
    private Cache cache = new Cache();

    @Getter
    @Setter
    public static class Cache {
        private boolean enabled = true;
        private int maxSize = 100;
        private long ttl = 3600; // 秒
        
        // getters/setters...
    }

    // getters/setters...
}