package com.example.demogit.celue.demo4;

import org.springframework.stereotype.Component;

@Component("train")
public class Train implements TravelType{
    @Override
    public void travle() {
        System.out.println("火车");
    }
}