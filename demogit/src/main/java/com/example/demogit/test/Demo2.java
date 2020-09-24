package com.example.demogit.test;

public class Demo2 {
    private String  a = "aaa";

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        Demo2 demo21 = new Demo2();
        System.out.println(demo2.equals(demo21));
        System.out.println(demo2.a.equals(demo21.a));
    }
}