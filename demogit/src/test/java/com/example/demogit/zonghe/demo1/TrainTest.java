package com.example.demogit.zonghe.demo1;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class TrainTest {

    @Autowired
    @Qualifier(value = "xl")
    private People people;
    @Test
    public void train(){
        people.setTravel(new HighTravel());
        people.name();
        people.peopleTravel();
    }
}