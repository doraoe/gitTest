package com.example.demogit.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SetDemo {
    public static void main(String[] args) {
        //Set接口
        HashSet hashSet = new HashSet<Object>();
        Person p1 = new Person("lz1",1);
        Person p2 = new Person("lz2",1);
        Person p3 = new Person("lz1",1);
        p2.setName("lz1");
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(new String("1"));
        hashSet.add(new String("2"));
        hashSet.add(new String("1"));
        hashSet.add(3);
        hashSet.add(23);
        hashSet.add(3);
        System.out.println(hashSet);
        for (Object o: hashSet) {
            System.out.println(o);
        }
        LinkedHashSet stringLinkedHashSet = new LinkedHashSet<String>();
        stringLinkedHashSet.add(p1);
        stringLinkedHashSet.add(p2);
        stringLinkedHashSet.add(p3);
        TreeSet treeSet = new TreeSet();
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);



    }
}