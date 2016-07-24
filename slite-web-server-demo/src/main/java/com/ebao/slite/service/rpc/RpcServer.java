package com.ebao.slite.service.rpc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RpcServer {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/rpc_server.xml");
        SampleService sampleService = (SampleService) applicationContext.getBean("sampleService");
    }

}
