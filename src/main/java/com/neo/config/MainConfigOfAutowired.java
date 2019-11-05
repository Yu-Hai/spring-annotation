package com.neo.config;

import com.neo.bean.RemoteServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MainConfigOfAutowired {
    
    @Profile("default")
    @Bean("devRemoteServer")
    public RemoteServer remoteServerDev() {
        return RemoteServer.builder().serverName("开发环境-远程服务").build();
    }

    @Profile("test")
    @Bean("testRemoteServer")
    public RemoteServer remoteServerTest() {
        return RemoteServer.builder().serverName("测试环境-远程服务").build();
    }
    
    @Profile("prod")
    @Bean("prodRemoteServer")
    public RemoteServer remoteServerProd() {
        return RemoteServer.builder().serverName("生产环境-远程服务").build();
    }
}
