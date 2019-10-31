package com.neo.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("1.Cat constructor ...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("2.Cat afterPropertiesSet ...");
    }

    public void destroy() throws Exception {
        System.out.println("4.Cat destroy ...");
    }
}
