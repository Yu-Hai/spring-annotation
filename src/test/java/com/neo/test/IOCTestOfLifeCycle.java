package com.neo.test;

import com.neo.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestOfLifeCycle {
    
    @Test
    public void test01(){
        // 1.创建IOC容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("3.容器创建完成 ...");
        // 2.关闭容器
        applicationContext.close();
    }

}
