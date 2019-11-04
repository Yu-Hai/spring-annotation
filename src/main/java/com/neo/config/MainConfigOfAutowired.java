package com.neo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.neo.bean.Boss;
import com.neo.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

@ComponentScan("com.neo.bean")
public class MainConfigOfAutowired {

    @Bean
    public DataSource dataSourceTest() throws Exception{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setJdbcUrl("jdbc:mysql://47.101.50.205:3306/mydb");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }


    @Bean
    public DataSource dataSourceDev() throws Exception{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setJdbcUrl("jdbc:mysql://47.101.50.205:3306/jingdiao");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }

}
