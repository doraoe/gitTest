package com.example.demogit.celue;

import com.example.demogit.celue.demo3.Order;
import com.example.demogit.celue.demo3.ServiceHandler;
import com.example.demogit.celue.demo3.ServiceTypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest3 {

    @Autowired
    private ServiceHandler serviceHandler;
    @Test
    public void demo3(){
        Order order = new Order(ServiceTypeEnum.Apply.getCode());
        serviceHandler.message(order);
    }
}