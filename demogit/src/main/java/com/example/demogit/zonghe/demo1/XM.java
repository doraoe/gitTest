package com.example.demogit.zonghe.demo1;

import org.springframework.stereotype.Component;

@Component("xm")
public class XM extends People{
    @Override
    void name() {
        System.out.println("我是小明");
    }
}