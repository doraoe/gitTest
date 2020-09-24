package com.example.demogit.celue.demo5;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ServerFactory {
    private static Map<String, ServerType> strategyMap = new HashMap<>();

    public static ServerType getInvokeStrategy(Order order) {
        return strategyMap.get(order.getType());
    }

    public static void register(String name, ServerType serverType) {
        if (StringUtils.isEmpty(name) || null == serverType) {
            return;
        }
        strategyMap.put(name, serverType);
    }
}