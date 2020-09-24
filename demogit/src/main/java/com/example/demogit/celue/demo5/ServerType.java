package com.example.demogit.celue.demo5;


import org.springframework.beans.factory.InitializingBean;

public interface ServerType extends InitializingBean {
    void message(Order order);
}
