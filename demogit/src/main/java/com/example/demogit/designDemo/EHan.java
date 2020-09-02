package com.example.demogit.designDemo;

public class EHan {
    private  static EHan eHan = new EHan();
    private EHan(){
    }
    public static EHan geteHan(){
        return eHan;
    }


}
