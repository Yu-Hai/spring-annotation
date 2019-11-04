package com.neo.test;

import com.neo.bean.Boss;
import com.neo.config.MainConfigOfAutowired;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestOfAutowired {
    
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);
    }
}
