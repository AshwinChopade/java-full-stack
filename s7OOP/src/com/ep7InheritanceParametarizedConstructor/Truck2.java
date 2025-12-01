package com.ep7InheritanceParametarizedConstructor;

public class Truck2 extends Vehicle2 {
    private String steering;
    private String musicSystem;
    private String seatBelt;
    private String airConditioner;
    private String container;


    public String run(){          //we created same name method in parent and child class(truck) and try to access from main class
        return "Truck running";
    }
}
