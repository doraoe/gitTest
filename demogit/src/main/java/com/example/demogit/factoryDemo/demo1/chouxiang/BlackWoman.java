package com.example.demogit.factoryDemo.demo1.chouxiang;

import com.example.demogit.factoryDemo.demo1.*;

public class BlackWoman implements Human{
    @Override
    public Sex getSex() {
        return new Woman();
    }

    @Override
    public Skin getSkin() {
        return new Black();
    }
}