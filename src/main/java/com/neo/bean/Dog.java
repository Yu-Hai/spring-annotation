package com.neo.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog {
    public Dog() {
        System.out.println("1.Dog constructor ...");
    }
    
    @PostConstruct
    public void postConstruct(){
        System.out.println("2.Dog postConstruct ...");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("4.Dog preDestroy ...");
    }
}
