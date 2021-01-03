package com.gai.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

public class XmlAop {

    public void pointCut(){}

    public void begin(JoinPoint joinPoint){
        System.out.println("使用XmlAop   开启事务！");
    }

    public void commit(JoinPoint joinPoint){
        System.out.println("使用XmlAop   提交事务！");
    }

    public void afterReturn(JoinPoint joinPoint,Object returnVal){
        System.out.println("XmlAop AfterReturning Advice:" + returnVal);
    }

    public void afterThrowing(JoinPoint joinPoint,Throwable error){
        System.out.println("XmlAop AfterThrowing Advice..." + error);
        System.out.println("AfterThrowing...");
    }

    public void around(ProceedingJoinPoint pjp){
        System.out.println("XmlAop Aronud before...");
        try {
            pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("XmlAop Aronud after...");
    }
}
