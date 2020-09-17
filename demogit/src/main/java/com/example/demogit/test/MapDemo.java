package com.example.demogit.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {
    public static void main(String[] args) {
        //map
        HashMap hashMap = new HashMap<String, String>();
        Object put = hashMap.put("lz", "lz");
        Object put2 = hashMap.put("lz", "lz");
        hashMap.get("lz");
        System.out.println("put--"+put2);

        TreeMap treeMap = new TreeMap<String,String>();
        treeMap.put("lz1","lz2");
        treeMap.get("lz1");

        LinkedHashMap linkedHashMap = new LinkedHashMap<String,String>();
        linkedHashMap.put("lz1","lz2");
        linkedHashMap.get("lz1");

        Hashtable hashTable = new Hashtable<String,String>();

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<String,String>();
        concurrentHashMap.put("lz1","lz2");
        concurrentHashMap.get("lz1");

        /*for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(()->{
                String v = "lz-"+ finalI+"-"+Thread.currentThread().getName();
                System.out.println(v);
                hashMap.put("lz"+ finalI,v);
            }).start();
            new Thread(()->{
                System.out.println("结果：key："+"lz"+ finalI + "；V：" +hashMap.get("lz"+ finalI));
            }).start();
        }*/

        System.out.println("遍历");
        //遍历hashMap
        for (Object s: hashMap.keySet()) {
            System.out.println(hashMap.get(s));
        }

        for (Object s: hashMap.values()) {
            System.out.println(s);
        }

        for (Object s: hashMap.entrySet()) {
            System.out.println(s);
        }

        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        hashMap.forEach((k,v) ->{
            System.out.println(String.valueOf(k) + String.valueOf(v));
        });
    }
}