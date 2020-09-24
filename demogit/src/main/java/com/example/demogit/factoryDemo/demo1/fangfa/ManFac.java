package com.example.demogit.factoryDemo.demo1.fangfa;

import com.example.demogit.factoryDemo.demo1.Man;
import com.example.demogit.factoryDemo.demo1.Sex;

public class ManFac extends SexFactory{
    @Override
    Sex getSex() {
        return new Man();
    }
}