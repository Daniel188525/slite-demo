package com.ebao.slite.service.rpc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RpcClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/rpc_client.xml");
        SampleService sampleService = (SampleService) applicationContext.getBean("sampleService");
        System.out.println(sampleService.say());
    }

}
