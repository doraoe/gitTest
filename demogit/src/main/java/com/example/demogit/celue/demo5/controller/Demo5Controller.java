package com.example.demogit.celue.demo5.controller;


import com.example.demogit.celue.demo5.Order;
import com.example.demogit.celue.demo5.ServerFactory;
import com.example.demogit.celue.demo5.ServerType;
import com.example.demogit.celue.demo5.ServiceTypeEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo5")
public class Demo5Controller {

    @GetMapping("/test")
    public void test(){
        Order applyOrder = new Order(ServiceTypeEnum.Apply.getCode());
        Order useOrder = new Order(ServiceTypeEnum.Use.getCode());
        ServerType invokeStrategy = ServerFactory.getInvokeStrategy(applyOrder);
        invokeStrategy.message(applyOrder);
    }

}