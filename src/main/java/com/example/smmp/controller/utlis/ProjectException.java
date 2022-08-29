package com.example.smmp.controller.utlis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ProjectException {

    @ExceptionHandler
    public R rRxception(Exception ex){

        log.warn(ex.toString());


        return new R(false,"服务异常");

    }

}
