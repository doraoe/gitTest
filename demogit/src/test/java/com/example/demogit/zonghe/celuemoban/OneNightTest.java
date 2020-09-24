package com.example.demogit.zonghe.celuemoban;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OneNightTest {

    @Test
    void sleep() {
        OneNight oneNight = new Wb();
        oneNight.sleep();
    }
}