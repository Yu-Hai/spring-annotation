package com.neo.config;

import com.neo.bean.Car;
import com.neo.bean.Cat;
import com.neo.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.neo")
public class MainConfigOfLifeCycle {
//    @Bean(initMethod = "init" , destroyMethod = "destory")
//    public Car car(){
//        return new Car();
//    }
    
//    @Bean
//    public Cat cat(){
//        return new Cat();
//    }
    
    @Bean
    public Dog dog(){
        return new Dog();
    }
}
