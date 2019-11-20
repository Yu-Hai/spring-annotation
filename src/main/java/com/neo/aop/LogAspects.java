package com.neo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class LogAspects {

    @Pointcut("execution(* com.neo.aop.MathCalculator.div(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void before(JoinPoint point) {
        point.getSignature().getDeclaringType();
        System.out.println(methodFullName(point) + "【开始】，参数列表：" + Arrays.asList(point.getArgs()));
    }

    @After("pointCut()")
    public void after(JoinPoint point) {
        System.out.println(methodFullName(point) + "【结束】");
    }

    @AfterReturning(value = "pointCut()", returning = "returning")
    public void afterReturning(JoinPoint point, Object returning) {
        System.out.println(methodFullName(point) + "【返回】：" + returning);
    }

    @AfterThrowing(value = "pointCut()", throwing = "throwing")
    public void afterThrowing(JoinPoint point, Exception throwing) {
        System.out.println(methodFullName(point) + "【异常】#" + throwing);
    }

    public String methodFullName(JoinPoint point) {
        return point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName();
    }
}
