package com.quan.springboot.handler;


import com.quan.springboot.exception.NotFindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgument(IllegalArgumentException ex) {
        return ex.getMessage();
    }


    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public String handleArithmetic(ArithmeticException ex) {
        return ex.getMessage();
    }


    @ExceptionHandler(NotFindException.class)
    public String handleNotFindException(NotFindException ex) {
        return ex.getMessage();
    }

}
