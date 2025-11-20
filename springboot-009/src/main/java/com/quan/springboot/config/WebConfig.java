package com.quan.springboot.config;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        YAMLMapper yamlMapper = new YAMLMapper();
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter(yamlMapper);
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(
                List.of(MediaType.parseMediaType("application/yaml"),
                        MediaType.parseMediaType("text/yaml")
                ));
        converters.add(mappingJackson2HttpMessageConverter);

    }
}
