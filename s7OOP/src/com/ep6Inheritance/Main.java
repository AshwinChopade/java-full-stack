package com.ep6Inheritance;

public class Main {
    public static void main(String[] args){
        Bike bike = new Bike();
        Car car= new Car();
        Truck truck = new Truck();
        car.airConditioner="present";
        bike.handle="short";
        System.out.println("extra property of car: "+car.airConditioner);
        System.out.println("extra property of bike: "+bike.handle);
        //these are the properties which are present in car and bike class respectively
        //now if we want to access properties from parent class i.e. vehicle then we use 'extend' as below

        bike.fuelTank=2;
        car.lights="LED";
        truck.engine="Petrol";
        System.out.println("inherited properties from Vehicle class: "+bike.fuelTank);
        System.out.println("inherited properties from Vehicle class: "+car.lights);
        System.out.println("inherited properties from Vehicle class: "+truck.engine);


    }
}
