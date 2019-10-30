package com.neo.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 1.能获取IOC使用的BeanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        // 2.能获取类加载器
        ClassLoader classLoader = context.getClassLoader();

        // 3.获取Bean定义的注册表
        BeanDefinitionRegistry registry = context.getRegistry();

        // 4.获取当前环境信息
        Environment environment = context.getEnvironment();

        String property = environment.getProperty("os.name");
        return property.contains("Linux");
    }
}
