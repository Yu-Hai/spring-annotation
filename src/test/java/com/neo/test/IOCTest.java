package com.neo.test;

import com.neo.bean.Person;
import com.neo.config.MainConfig;
import com.neo.config.MainConfig02;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class IOCTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig02.class);
        System.out.println("1.初始化完成");
        applicationContext.getBean("person");
    }

    @Test
    public void test03() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig02.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String os_name = environment.getProperty("os.name");
        System.out.println(os_name);


        for (String name : applicationContext.getBeanNamesForType(Person.class)) {
            System.out.println(name);
        }

        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
        for (Map.Entry<String, Person> personEntry : beansOfType.entrySet()) {
            System.out.println(personEntry.getKey() + "-" + personEntry.getValue());
        }
    }
    
    @Test
    public void test04(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig02.class);
        String[] names = applicationContext.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test05(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig02.class);
        Object colorFactoryBean = applicationContext.getBean("colorFactoryBean");
        System.out.println(colorFactoryBean.getClass());

        Object factoryBean = applicationContext.getBean("&colorFactoryBean");
        System.out.println(factoryBean.getClass());
    }
}
