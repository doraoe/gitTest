package com.example.demogit.zonghe.celuemoban2;

public abstract class OnDayCommon implements Onday{
    @Override
    public void onDay() {
        System.out.println("起床");
        System.out.println("上厕所");
        otherMethod();
    }

    protected abstract void otherMethod();

    public static void main(String[] args) {
        OnDayCommon onDayCommon = new Wm();
        onDayCommon.onDay();
        OnDayCommon onDayCommon2 = new Wl();
        onDayCommon2.onDay();
    }
}

