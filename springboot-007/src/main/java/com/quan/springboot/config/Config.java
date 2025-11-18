package com.quan.springboot.config;
import com.quan.springboot.bean.A;
import com.quan.springboot.bean.B;
import com.quan.springboot.bean.C;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {



    @Bean
    public A getA() {
        return new A();
    }

    @Bean
    public C getC() {
        return new C();
    }


    @Bean
    @ConditionalOnBean(C.class)
    public B getB() {
        return new B();
    }



}
