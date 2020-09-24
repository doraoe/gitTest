package com.example.demogit.factoryDemo.demo1.chouxiang;

import com.example.demogit.factoryDemo.demo1.Sex;
import com.example.demogit.factoryDemo.demo1.Skin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HumanTest {
    @Test
    public void test(){
        Human human = new YellowHuman();
        Sex sex = human.getSex();
        Skin skin = human.getSkin();
        sex.sex();
        skin.skin();
    }

}