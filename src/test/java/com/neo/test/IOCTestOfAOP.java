package com.neo.test;

import com.neo.aop.MathCalculator;
import com.neo.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestOfAOP {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
        MathCalculator calculator = applicationContext.getBean(MathCalculator.class);
        
        calculator.div(1,1);
    }
}
