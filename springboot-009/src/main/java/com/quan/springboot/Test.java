package com.quan.springboot;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

public class Test {
    public static void main(String[] args) {
        YAMLMapper yamlMapper = new YAMLMapper();
//        yamlMapper.writer

//        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter(yamlMapper);
//        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(List.of(
//                MediaType.parseMediaType("application/yaml"),
//                MediaType.parseMediaType("text/yaml")
//        ));
    }
}
