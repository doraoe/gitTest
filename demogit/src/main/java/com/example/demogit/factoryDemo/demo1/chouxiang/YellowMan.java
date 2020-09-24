package com.example.demogit.factoryDemo.demo1.chouxiang;

import com.example.demogit.factoryDemo.demo1.Man;
import com.example.demogit.factoryDemo.demo1.Sex;
import com.example.demogit.factoryDemo.demo1.Skin;
import com.example.demogit.factoryDemo.demo1.Yellow;

public class YellowMan implements Human{
    @Override
    public Sex getSex() {
        return new Man();
    }

    @Override
    public Skin getSkin() {
        return new Yellow();
    }
}