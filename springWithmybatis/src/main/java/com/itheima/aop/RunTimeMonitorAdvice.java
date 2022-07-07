package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RunTimeMonitorAdvice {
    @Pointcut("execution(* *..*(..))")
    public void pt(){}

    @Around("pt()")
    public Object runtimeAround(ProceedingJoinPoint pjp) throws Throwable {
        long starTime = System.currentTimeMillis();

        Object ret = pjp.proceed();

        long endTime = System.currentTimeMillis();

        System.out.println("run"+":"+(endTime-starTime)+"ms");
        return ret;
    }
}
