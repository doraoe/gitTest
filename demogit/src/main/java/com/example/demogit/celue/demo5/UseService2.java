package com.example.demogit.celue.demo5;


import org.springframework.stereotype.Component;

@Component
public class UseService2 implements ServerType{

    @Override
    public void message(Order order) {
        System.out.println("用信前置检查");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ServerFactory.register(ServiceTypeEnum.Use.getCode(), this);
    }
}