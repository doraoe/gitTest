package com.example.demogit.zonghe.celuemoban2;

public class Lm implements Onday{
    @Override
    public void onDay() {
        System.out.println("起床");
        System.out.println("上厕所");
        System.out.println("看电脑");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}