package com.neo.test;

import com.neo.bean.Boss;
import com.neo.bean.RemoteServer;
import com.neo.config.MainConfigOfAutowired;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestOfAutowired {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
//        // 指定激活环境
//        applicationContext.getEnvironment().addActiveProfile("dev");
//        // 注册配置类
//        applicationContext.register(MainConfigOfAutowired.class);
//        // 应用配置
//        applicationContext.refresh();

        for (String name : applicationContext.getBeanNamesForType(RemoteServer.class)) {
            System.out.println(name);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 指定激活环境
        applicationContext.getEnvironment().addActiveProfile("prod");
        // 注册配置类
        applicationContext.register(MainConfigOfAutowired.class);
        // 应用配置
        applicationContext.refresh();
        
        for (String name : applicationContext.getBeanNamesForType(RemoteServer.class)) {
            System.out.println(name);
            
        }

        RemoteServer bean = applicationContext.getBean(RemoteServer.class);
        System.out.println(bean.getServerName());
    }


}
