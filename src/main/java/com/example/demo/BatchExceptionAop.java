package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BatchExceptionAop {
    // ��O�����������ɉ��f�I�ɏ������s��
    @AfterThrowing(value="execution(* run(..))", throwing="exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        System.out.println(joinPoint.getTarget().getClass().getName() + ":" + exception.getMessage());
    }
}
