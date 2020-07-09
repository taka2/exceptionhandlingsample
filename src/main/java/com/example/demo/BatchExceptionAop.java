package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BatchExceptionAop {
    // —áŠOˆ—”­¶‚É‰¡’f“I‚Éˆ—‚ğs‚¤
    @AfterThrowing(value="execution(* run(..))", throwing="exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        System.out.println(joinPoint.getTarget().getClass().getName() + ":" + exception.getMessage());
    }
}
