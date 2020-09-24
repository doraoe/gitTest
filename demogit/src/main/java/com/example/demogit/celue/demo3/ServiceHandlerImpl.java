package com.example.demogit.celue.demo3;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ServiceHandlerImpl implements ServiceHandler{

    private Map<String,ServiceService> serviceMap = new HashMap<>();
    @Override
    public void message(Order order) {
        String type = order.getType();
        ServiceService serviceService = serviceMap.get(type);
        serviceService.onMessage();
        //System.out.println(serviceService.getClass().getSimpleName() + "--前置检查");
    }

    @Override
    public void register(String meh, ServiceService serviceService) {
        System.out.println("注册：" + meh + ";服务是：" + serviceService.getClass().getSimpleName());
       serviceMap.put(meh,serviceService);
    }

}