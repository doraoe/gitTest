package com.example.demogit.zonghe.celuemoban;

public class OneNightCl {
    private OneNight oneNight;

    public void setOneNight(OneNight oneNight) {
        this.oneNight = oneNight;
    }

    public void before(){
        oneNight.beforeSleep();
    }
}