package com.neo.condition;

import com.neo.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean contain = registry.containsBeanDefinition("com.neo.bean.Red") && registry.containsBeanDefinition("com.neo.bean.Blue");
        if(contain){
            RootBeanDefinition rainBow = new RootBeanDefinition(RainBow.class);
            registry.registerBeanDefinition("rainBow" , rainBow);
        }
    }
}
