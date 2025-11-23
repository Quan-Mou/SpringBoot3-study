package com.quan.springboot.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;


//@Getter
@AllArgsConstructor
@Getter
public enum StatuEnum {

    OK(200,"success"),
    FAIL(400,"fail");
    private Integer code;
    private String msg;

}
