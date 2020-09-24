package com.example.demogit.celue.demo5;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
class FactoryTest {

    @Test
    void getInvokeStrategy() {
        Order order2 = new Order("apply");
        ServerType invokeStrategy = ServerFactory.getInvokeStrategy(order2);
        invokeStrategy.message(order2);
    }
}