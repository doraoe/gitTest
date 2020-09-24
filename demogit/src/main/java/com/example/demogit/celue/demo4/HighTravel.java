package com.example.demogit.celue.demo4;

import org.springframework.stereotype.Component;

@Component("highTravel")
public class HighTravel implements TravelType{
    @Override
    public void travle() {
        System.out.println("高铁");
    }
}