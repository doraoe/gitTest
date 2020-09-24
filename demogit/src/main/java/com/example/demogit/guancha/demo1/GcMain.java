package com.example.demogit.guancha.demo1;

public class GcMain {
    public static void main(String[] args) {
        Subjects subjects = new Subjects();
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        subjects.addObserver(task1);
        subjects.addObserver(task2);
        subjects.notifyObserver("ssss");
        subjects.notifyObserver("aaaa");
    }
}