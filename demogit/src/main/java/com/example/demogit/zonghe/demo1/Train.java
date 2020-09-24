package com.example.demogit.zonghe.demo1;

import org.springframework.stereotype.Component;

//@Component
public class Train implements Travel{
    @Override
    public void travel() {
        System.out.println("乘坐火车");
    }
}