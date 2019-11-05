package com.neo.config;

import com.neo.aop.LogAspects;
import com.neo.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfAOP {
        
    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }
    
    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
    
}