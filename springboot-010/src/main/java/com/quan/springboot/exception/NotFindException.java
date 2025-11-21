package com.quan.springboot.exception;

import lombok.Data;

@Data
public class NotFindException extends RuntimeException{

    private String msg;


    public NotFindException( String msg) {
        super(msg);
    }
}
