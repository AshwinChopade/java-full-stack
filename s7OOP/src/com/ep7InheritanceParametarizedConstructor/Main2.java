package com.ep7InheritanceParametarizedConstructor;

public class Main2 {
    public static void main(String[] args){
        Bike2 bike2 = new Bike2("Petrol",2,4,2,"lED","Long");
        System.out.println(bike2);

        Truck2 truck2 = new Truck2();
        System.out.println(truck2.run());   //after printing this it will prioritize child class method
    }
}
