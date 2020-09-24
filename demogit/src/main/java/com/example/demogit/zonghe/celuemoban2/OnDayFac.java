package com.example.demogit.zonghe.celuemoban2;

import java.util.HashMap;
import java.util.Map;

public class OnDayFac {
    private static Map<String,Onday> ondayMap = new HashMap<>();
    public static Onday getOnDay(String name){
        Onday onday = ondayMap.get(name);
        return onday;
    }
    public static void register(String name,Onday onday){
        ondayMap.put(name,onday);
    }
}