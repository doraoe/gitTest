package com.example.demogit.celue.demo5;

public class ServerCl {
    private ServerType serverType;

    public void setServerType(ServerType serverType) {
        this.serverType = serverType;
    }
    public void message(Order order){
        serverType.message(order);
    }
}