package com.example.demogit.celue.demo5;

import org.springframework.stereotype.Service;


@Service
public class ApplyService2 implements ServerType{
    @Override
    public void message(Order order) {
        System.out.println("授信");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ServerFactory.register(ServiceTypeEnum.Apply.getCode(), this);
    }
}