package com.example.demogit.guancha.demo1;

public class Task2 implements Observer{
    @Override
    public void update(Object object) {
        System.out.println(this.getClass().getSimpleName() + "更新" + object);
    }
}