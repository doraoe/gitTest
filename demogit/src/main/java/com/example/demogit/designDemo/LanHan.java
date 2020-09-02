package com.example.demogit.designDemo;

public class LanHan {
    private static LanHan lanHan;
    private LanHan(){
    }
    public static LanHan getLanHan(){
        if (lanHan == null){
            synchronized (LanHan.class){
                if (lanHan == null){
                    lanHan = new LanHan();
                }
            }
        }
        return lanHan;
    }
}