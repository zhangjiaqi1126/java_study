package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//1.制作通知类，在类中定义一个方法用于完成共性功能
@Component
@Aspect
public class AOPAdvice {

    @Pointcut("execution(* *..*(..))")
    public void pt1(){}

    @Before("pt1()")
    public void before(){
        System.out.println("before");
    }
//    public void after(JoinPoint jp){
//        Object[] args = jp.getArgs();
//        System.out.println("after"+args[0]);
//    }

    public void after(int a,int b){
        System.out.println("after"+a+","+b);
    }


    public void afterReturnning(){
        System.out.println("afterReturnning");
    }
    public void afterTgrowing(Throwable t){
        System.out.println(t.getMessage());
    }
    public void around(ProceedingJoinPoint pjp){
        System.out.println("brfore");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());        }
        System.out.println("after");

    }
}
