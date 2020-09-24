package com.example.demogit.zonghe.demo1;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class People {
    //@Autowired
    protected Travel travel;

    public void setTravel(Travel travel) {
        this.travel = travel;
    }
    public People(){
        System.out.println("我首先是人");
    }

    abstract void name();
    void peopleTravel(){
        travel.travel();
    }
}