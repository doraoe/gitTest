package com.example.demogit.factoryDemo.demo1.fangfa;

import com.example.demogit.factoryDemo.demo1.Sex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class SexFactoryTest {
        @Test
    public void test(){
            SexFactory sexFactory = new ManFac();
            Sex sex = sexFactory.getSex();
            sex.sex();
        }
}