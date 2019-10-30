package com.neo.config;

import com.neo.bean.Color;
import com.neo.bean.ColorFactoryBean;
import com.neo.bean.Person;
import com.neo.bean.Red;
import com.neo.condition.LinuxCondition;
import com.neo.condition.MyImportBeanDefinitionRegistrar;
import com.neo.condition.MyImportSelector;
import com.neo.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class MainConfig02 {
    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
