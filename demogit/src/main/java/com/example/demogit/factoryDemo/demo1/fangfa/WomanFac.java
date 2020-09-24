package com.example.demogit.factoryDemo.demo1.fangfa;

import com.example.demogit.factoryDemo.demo1.Sex;
import com.example.demogit.factoryDemo.demo1.Woman;

public class WomanFac extends SexFactory{
    @Override
    Sex getSex() {
        return new Woman();
    }
}