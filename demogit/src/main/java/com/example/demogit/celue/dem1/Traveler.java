package com.example.demogit.celue.dem1;

public class Traveler {
    TravelStrategy travelStrategy;

    public Traveler() {
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travelStyle(){
        travelStrategy.travelSt();
    }


    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        traveler.setTravelStrategy(new TrainStrategy());
        traveler.travelStyle();
    }
}