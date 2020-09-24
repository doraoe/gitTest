package com.example.demogit.guancha.demo1;

import java.util.ArrayList;
import java.util.List;

public class Subjects {
    private List<Observer> container = new ArrayList<>();

    public void addObserver(Observer observer) {
        container.add(observer);
    }

    public void removeObserver(Observer observer) {
        container.remove(observer);
    }

    public void notifyObserver(Object object) {
        for (Observer item : container) {
            item.update(object);
        }
    }
}