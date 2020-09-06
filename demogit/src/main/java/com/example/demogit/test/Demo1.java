package com.example.demogit.test;

public class Demo1 {
    public static void main(String[] args) {
        String a = "11";
        String b = "12";
        String replace = b.replace("2", "1");
        System.out.println(replace);
        System.out.println(a == replace);
    }
}