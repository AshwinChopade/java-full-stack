package com.ep8InheritanceExample;

public class Eagle extends Bird{
    public Eagle(double height, double weight, String bloodType, String animalType, String animalWithFeather, String canFly) {
        super(height, weight, bloodType, animalType, animalWithFeather, canFly);
    }

    @Override
    public String showInfo() {
        return "Eagle{} " + super.showInfo();
    }
}
