package com.neo.bean;

import org.springframework.beans.factory.FactoryBean;

public class ColorFactoryBean implements FactoryBean<Color> {
    /** 返回一个将被添加到容器中的对象 */
    public Color getObject() {
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    /** 是否是单例 */
    public boolean isSingleton() {
        return true;
    }
}
