package com.example.demogit.zonghe.celuemoban;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OneNightClTest {

    @Test
    void before() {
        OneNightCl oneNightCl = new OneNightCl();
        oneNightCl.setOneNight(new Wb());
        oneNightCl.before();
    }
}