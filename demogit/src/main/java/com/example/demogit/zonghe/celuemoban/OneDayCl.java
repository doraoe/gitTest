package com.example.demogit.zonghe.celuemoban;

public class OneDayCl {
    private OneDay oneDay;

    public void setOneDay(OneDay oneDay) {
        this.oneDay = oneDay;
    }
    public void baiTain(){
        oneDay.weak();
        oneDay.eat();
        oneDay.drink();
    }
}