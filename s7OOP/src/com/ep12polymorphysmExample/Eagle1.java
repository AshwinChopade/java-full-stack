package com.ep12polymorphysmExample;

public class Eagle1 extends Bird1 {
    public Eagle1(double height, double weight, String bloodType, String animalType, String animalWithFeather, String canFly) {
        super(height, weight, bloodType, animalType, animalWithFeather, canFly);
    }

    @Override
    public String showInfo() {
        return "Eagle{} " + super.showInfo();
    }
}
