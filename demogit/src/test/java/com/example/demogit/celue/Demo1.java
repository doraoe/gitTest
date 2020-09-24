package com.example.demogit.celue;

import com.example.demogit.celue.dem2.People;
import com.example.demogit.celue.dem2.PeopleMainFactory;
import com.example.demogit.celue.dem2.PeopleMainStrategy;
import com.example.demogit.celue.dem2.XIaoMing;
import org.junit.jupiter.api.Test;

public class Demo1 {
    @Test
    public void demo1(){
        System.out.println("-工厂-");
        PeopleMainFactory peopleMainFactory = new PeopleMainFactory();
        People people = peopleMainFactory.getPeople(XIaoMing.class);
        people.eat();
        people.run();
        System.out.println("-策略-");
        PeopleMainStrategy peopleMainStrategy = new PeopleMainStrategy();
        peopleMainStrategy.setPeople(new XIaoMing());
        peopleMainStrategy.eat();
        peopleMainStrategy.run();

    }
}