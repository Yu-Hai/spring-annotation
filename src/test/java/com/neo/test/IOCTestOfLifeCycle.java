package com.neo.test;

import com.neo.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;
import javax.inject.Inject;

public class IOCTestOfLifeCycle {
    
    @Test
    @Resource(name = "person")
    @Inject
    public void test01(){
        // 1.创建IOC容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("3.容器创建完成 ...");
        // 2.关闭容器
        applicationContext.close();
    }

}
