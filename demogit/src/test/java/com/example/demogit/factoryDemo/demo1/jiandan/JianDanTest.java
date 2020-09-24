package com.example.demogit.factoryDemo.demo1.jiandan;

import com.example.demogit.factoryDemo.demo1.Sex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class JianDanTest {

    @Test
    public void test(){
        JianDan jianDan = new JianDan();
        Sex man = jianDan.getPeople("man");
        man.sex();

    }
}