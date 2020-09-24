package com.example.demogit.celue.demo3;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UseService extends ServiceService{

    @Override
    public void onMessage() {
        System.out.println("用信前置检查");
    }

    @Override
    @PostConstruct
    public void register() {
        serviceHandler.register(ServiceTypeEnum.Use.getCode(), this);
    }
}