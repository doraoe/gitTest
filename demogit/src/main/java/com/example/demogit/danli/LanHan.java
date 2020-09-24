package com.example.demogit.danli;

public class LanHan {
    private volatile static LanHan lanHan;
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