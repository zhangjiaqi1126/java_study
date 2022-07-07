package com.itheima2.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//1.制作通知类，在类中定义一个方法用于完成共性功能

@Component
@Aspect
public class AOPAdvice1 {
    @Pointcut("execution(* *..*(..))")
    public void pt1(){}


    @Before("pt1()")
    public void before(){
        System.out.println("before");
    }


    public void after(){
        System.out.println("after");
    }


    public void afterReturnning(){
        System.out.println("afterReturnning");
    }
    public void afterTgrowing(){
        System.out.println("afterTgrowing");
    }
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("brfore");
        pjp.proceed();
        System.out.println("after");

    }
}
