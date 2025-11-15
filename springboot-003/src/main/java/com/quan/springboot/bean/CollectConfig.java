package com.quan.springboot.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.List;
import java.util.Map;



@ConfigurationProperties(prefix = "collect")
public class CollectConfig {
//    数组
    private String[] hobby;
//    list
    private List<Address> addrs;
//    map
    private Map<String,Integer> map;

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public void setAddrs(List<Address> addrs) {
        this.addrs = addrs;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "CollectConfig{" +
                "hobby=" + Arrays.toString(hobby) +
                ", addrs=" + addrs +
                ", map=" + map +
                '}';
    }
}
