package com.example.demogit.factoryDemo.demo1.jiandan;

import com.example.demogit.factoryDemo.demo1.Man;
import com.example.demogit.factoryDemo.demo1.Sex;
import com.example.demogit.factoryDemo.demo1.Woman;

public class JianDan {

    /*public People getPeople(Class c){
        People people = null;
        try {
            people = (People) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return people;
    }*/
    public Sex getPeople(String sex){
        if (sex.equalsIgnoreCase("man")){
            return new Man();
        }else if (sex.equalsIgnoreCase("woMan")){
            return new Woman();
        }else {
            return null;
        }
    }
}