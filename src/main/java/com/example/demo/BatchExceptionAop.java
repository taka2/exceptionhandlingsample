package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BatchExceptionAop {
    // 例外処理発生時に横断的に処理を行う
    @AfterThrowing(value="execution(* run(..))", throwing="exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        System.out.println(joinPoint.getTarget().getClass().getName() + ":" + exception.getMessage());
    }
}
