package com.example.demogit.test;

public class Demo1 {
    public static void main(String[] args) {
        String a = "11";
        String b = "12";
        String replace = b.replace("2", "1");
        System.out.println(replace);
        System.out.println(a == replace);
        toBin("abc");
    }
    public static void toBin(String s){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String s1 = Integer.toBinaryString(chars[i]);
            System.out.print(s1);
        }
    }
}