package com.example.demogit.proxyDemo.jingtai;

public class GrilProxy implements Gril{
    private Gril gril;

    public GrilProxy(Gril gril) {
        this.gril = gril;
    }

    @Override
    public void name() {
        gril.name();
    }

    @Override
    public void date() {
        gril.date();
    }
}