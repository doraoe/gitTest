package com.example.demogit.zonghe.celuemoban2;

public class OnDayCl {
    private Onday onday;

    public void setOnday(Onday onday) {
        this.onday = onday;
    }
    public void onDay(){
        onday.onDay();
    }

    public static void main(String[] args) {
        OnDayCl lm = new OnDayCl();
        lm.setOnday(new Lm());
        lm.onDay();
        OnDayCl ll = new OnDayCl();
        ll.setOnday(new Ll());
        ll.onDay();
    }
}