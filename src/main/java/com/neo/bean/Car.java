package com.neo.bean;

import org.springframework.stereotype.Component;

@Component
public class Car {
    
    public Car(){
        System.out.println("1.Car constructor ...");
    }
    
    public void init(){
        System.out.println("2.Car init ...");
    }
    
    public void destory(){
        System.out.println("4.Car destory ...");
    }
}
