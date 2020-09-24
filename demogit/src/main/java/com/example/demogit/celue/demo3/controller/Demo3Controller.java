package com.example.demogit.celue.demo3.controller;

import com.example.demogit.celue.demo3.Order;
import com.example.demogit.celue.demo3.ServiceHandler;
import com.example.demogit.celue.demo3.ServiceTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo3")
public class Demo3Controller {

    @Autowired
    private ServiceHandler serviceHandler;

    @GetMapping("/test")
    public void test(){
        Order applyOrder = new Order(ServiceTypeEnum.Apply.getCode());
        Order useOrder = new Order(ServiceTypeEnum.Use.getCode());
        serviceHandler.message(applyOrder);
        serviceHandler.message(useOrder);
    }

}