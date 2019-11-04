package com.neo.bean;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class Boss implements ApplicationContextAware, EmbeddedValueResolverAware {
    private ApplicationContext applicationContext;
    private StringValueResolver resolver;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        // 可以取出环境变量中的值并解析
        String resolveStringValue = resolver.resolveStringValue("你好：${os.name}");
        System.out.println(resolveStringValue);
    }

    public Boss(Car car){
        this.car = car;
        System.out.println("Boss 的有参构造器");
    }
    
    private Car car;

    public Car getCar() {
        return car;
    }

    /**
     * 标注在方法上：Spring容器创建当前对象，就会调用方法，完成赋值
     * 方法使用的参数，自定义类型的值从ioc容器中获取
     */
    // @Autowired 
    public void setCar(Car car) {
        this.car = car;
    }
    
}
