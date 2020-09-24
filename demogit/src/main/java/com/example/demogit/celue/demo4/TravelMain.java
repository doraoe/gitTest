package com.example.demogit.celue.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TravelMain {

    @Autowired
    @Qualifier("HighTravel")
    private TravelType travelType;

   /* public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }*/

    private void travel(){
        travelType.travle();
    }

    public static void main(String[] args) {
        TravelMain travelMain = new TravelMain();
        //travelMain.setTravelType(new Train());
        travelMain.travel();
    }
}