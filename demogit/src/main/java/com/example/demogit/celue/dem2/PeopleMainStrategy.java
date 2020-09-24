package com.example.demogit.celue.dem2;

public class PeopleMainStrategy {
    private People people;

    public void setPeople(People people) {
        this.people = people;
    }

    public void run(){
        people.run();
    }

    public void eat(){
        people.eat();
    }

    public static void main(String[] args) {
        PeopleMainStrategy peopleMain = new PeopleMainStrategy();
        peopleMain.setPeople(new XiaoLi());
        peopleMain.eat();
        peopleMain.run();
    }
}