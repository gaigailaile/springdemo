package com.gai.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop {

    @Pointcut("execution(* com.gai.service.UserService.add())")
    public void pointCut(){}

//    @Before("pointCut()")
//    public void begin(JoinPoint joinPoint){
//        System.out.println("使用aop   开启事务！");
//    }
//
//    @After("pointCut()")
//    public void commit(JoinPoint joinPoint){
//        System.out.println("使用aop   提交事务！");
//    }
//
//    @AfterReturning(pointcut="execution(* com.gai.service.UserService.returnBoolean())",returning="returnVal")
//    public void afterReturn(JoinPoint joinPoint,Object returnVal){
//        System.out.println("AOP AfterReturning Advice:" + returnVal);
//    }
//
//    @AfterThrowing(pointcut="execution(* com.gai.service.UserService.edit())",throwing="error")
//    public void afterThrowing(JoinPoint joinPoint,Throwable error){
//        System.out.println("AOP AfterThrowing Advice..." + error);
//        System.out.println("AfterThrowing...");
//    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint pjp){
        System.out.println("AOP Aronud before...");
        try {
            pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("AOP Aronud after...");
    }
}
