package com.example.demogit.celue.demo3;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class ServiceService {
    @Autowired
    protected ServiceHandler serviceHandler;

    abstract  void onMessage();

    abstract  void register();
}
