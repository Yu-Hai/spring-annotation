package com.neo.test;

import com.neo.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class IOCTestOfPropertyValues {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
        Object person = applicationContext.getBean("person");
        System.out.println(person);

        // 配置文件的内容被加载到环境变量中
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        System.out.println("person.area:" + environment.getProperty("person.area"));
        applicationContext.close();
    }

}
