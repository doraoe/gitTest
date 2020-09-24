package com.example.demogit.celue.demo3;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ApplyService extends ServiceService {

    @Override
    public void onMessage() {
        System.out.println("授信前置检查");
    }

    @Override
    @PostConstruct
    public void register() {
        serviceHandler.register(ServiceTypeEnum.Apply.getCode(), this);
    }
}