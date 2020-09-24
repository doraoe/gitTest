package com.example.demogit.zonghe.celuemoban2;

import org.springframework.stereotype.Component;

@Component
public class Wm extends OnDayCommon{
    @Override
    protected void otherMethod() {
        System.out.println("看电脑");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        OnDayFac.register("wm",this);
    }
}