package com.example.demogit.test;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListDemo {
    public static void main(String[] args) {
        //list
        ArrayList arrayList = new ArrayList<String>();
        arrayList.add("lz1");
        arrayList.add("lz2");
        arrayList.get(1);
        arrayList.get(0);


        //vector
        Vector vector = new Vector<String>();
        vector.add("lz1");
        vector.add("lz2");
        vector.get(1);


        //linkedList
        LinkedList linkedList = new LinkedList<String>();
        linkedList.add("lz1");
        linkedList.add("lz2");
        linkedList.add(1,"lz3");
        linkedList.get(2);
        linkedList.addFirst("f");
        linkedList.addLast("l");
        linkedList.push("lz1");
        System.out.println(linkedList);

        List<String> objects = Collections.synchronizedList(new ArrayList<String>());
        objects.add("lz1");
        objects.get(0);

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("lz1");
        copyOnWriteArrayList.get(0);

        //arrayList遍历
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        for (Object s: arrayList) {
            System.out.println(s);
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
       /* arrayList.forEach(s->{
            System.out.println(s);
        });*/
    }
}