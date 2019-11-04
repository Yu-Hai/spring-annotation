package com.neo.config;

import com.neo.bean.Car;
import com.neo.bean.Cat;
import com.neo.bean.Dog;
import com.neo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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


    @Bean
    @Primary
    public Person person1() {
        return new Person("张三", 20, "北京");
    }

    @Bean
    public Person person2() {
        return new Person("李四", 25, "上海");
    }
}
