package com.example.demogit.zonghe.celuemoban2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OnDayCommonTest {

    @Test
    void onDay() {
        String name = "wm";
        Onday onDay = OnDayFac.getOnDay(name);
        onDay.onDay();
    }
}