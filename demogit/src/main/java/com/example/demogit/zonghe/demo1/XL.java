package com.example.demogit.zonghe.demo1;

import org.springframework.stereotype.Component;

@Component("xl")
public class XL extends People{
    @Override
    void name() {
        System.out.println("我是小李");
    }
}