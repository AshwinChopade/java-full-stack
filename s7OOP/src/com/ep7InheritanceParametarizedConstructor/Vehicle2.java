package com.ep7InheritanceParametarizedConstructor;

public class Vehicle2 {
    private String engine;
    private int wheels;
    private int seats;
    private int fuelTank;
    private String lights;

    public Vehicle2() {
        engine="petrol";
        wheels=4;
        seats=4;
        fuelTank=14;
        lights="LED";
    }

    public Vehicle2(String engine, int wheels, int fuelTank, int seats, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.fuelTank = fuelTank;
        this.seats = seats;
        this.lights = lights;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public String getLights() {
        return lights;
    }

    public void setLights(String lights) {
        this.lights = lights;
    }

    public String run(){          //we created same name method in parent and child class(truck) and try to access from main class
        return "Vehicle running";
    }

    @Override
    public String toString() {
        return "Vehicle2{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", fuelTank=" + fuelTank +
                ", lights='" + lights + '\'' +
                '}';
    }
}
