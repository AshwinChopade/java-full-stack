package com.ep7InheritanceParametarizedConstructor;

public class Car2 extends Vehicle2 {
    private String steering;
    private String musicSystem;
    private String seatBelt;
    private String airConditioner;
    private String fridge;

    public Car2() {
        steering="round";
        musicSystem="bluetooth";
        seatBelt="Yes";
        airConditioner="big";
        fridge="yes";
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

    public void setEntertainmentSystem(String entertainmentSystem) {
        this.entertainmentSystem = entertainmentSystem;
    }

    public String getFridge() {
        return fridge;
    }

    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public String getSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(String seatBelt) {
        this.seatBelt = seatBelt;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(String musicSystem) {
        this.musicSystem = musicSystem;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    private String entertainmentSystem;
}
