package com.example.demogit.celue.dem2;


public class PeopleMainFactory {

    public People getPeople(Class c){
        People people = null;
        try {
            people = (People)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return people;
    }

    public static void main(String[] args){
        PeopleMainFactory peopleMainFactory = new PeopleMainFactory();
        People people = peopleMainFactory.getPeople(XiaoLi.class);
        people.eat();
        people.run();
    }
}