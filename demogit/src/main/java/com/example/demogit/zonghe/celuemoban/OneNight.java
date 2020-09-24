package com.example.demogit.zonghe.celuemoban;

public abstract class OneNight {
    public void sleep(){
        beforeSleep();
        System.out.println("睡觉");
    }

    protected abstract void beforeSleep();
}