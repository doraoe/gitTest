package com.example.demogit.designDemo.danli;

public class LanHan2 {
    private static volatile LanHan2 lanHan2;
    private LanHan2(){
    }
    public static LanHan2 getLanHan2(){
        if (lanHan2 == null){
            synchronized (LanHan2.class){
                if (lanHan2 == null){
                    lanHan2 = new LanHan2();
                }
            }
        }
        return lanHan2;
    }
}