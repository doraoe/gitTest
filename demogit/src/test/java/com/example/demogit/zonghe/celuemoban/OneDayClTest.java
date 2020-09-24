package com.example.demogit.zonghe.celuemoban;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OneDayClTest {

    @Test
    void baiTain() {
        OneDayCl oneDayCl = new OneDayCl();
        oneDayCl.setOneDay(new Xl());
        oneDayCl.baiTain();
    }
}