package com.example.demogit.factoryDemo.demo1.chouxiang;

import com.example.demogit.factoryDemo.demo1.*;

public class BlackMan implements Human{
    @Override
    public Sex getSex() {
        return new Man();
    }

    @Override
    public Skin getSkin() {
        return new Black();
    }
}