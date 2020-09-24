package com.example.demogit.zonghe.celuemoban2;

import org.springframework.stereotype.Component;

@Component
public class Wl extends OnDayCommon{
    @Override
    protected void otherMethod() {
        System.out.println("看电视");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        OnDayFac.register("wl",this);
    }
}