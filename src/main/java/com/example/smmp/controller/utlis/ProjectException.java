package com.example.smmp.controller.utlis;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectException {

    @ExceptionHandler
    public R rRxception(Exception ex){

        return new R(false,"服务异常");

    }

}
