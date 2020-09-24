package com.example.demogit.zonghe.celuemoban2;

public class Ll implements Onday{
    @Override
    public void onDay() {
        System.out.println("起床");
        System.out.println("上厕所");
        System.out.println("看电视");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}