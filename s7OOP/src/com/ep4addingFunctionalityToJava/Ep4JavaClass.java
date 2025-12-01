package com.ep4addingFunctionalityToJava;

public class Ep4JavaClass {
    public static void main(String[] args){
        Ep4Cars cars = new Ep4Cars();
        cars.setDoors("clossed");
        cars.setDriver("seated");
        cars.setEngine("on");
        cars.setSpeed(5);
        //without setting this above value we get nullPointerException
        System.out.println(cars.run());

    }
}
