package com.ep8InheritanceExample;

public class Bird extends Animal{
    private String animalWithFeather;
    private String canFly;

    public Bird() {
        animalWithFeather="yes";
        canFly="yes";
    }

    public Bird(double height, double weight, String bloodType, String animalType, String animalWithFeather, String canFly) {
        super(height, weight, bloodType, animalType);
        this.animalWithFeather = animalWithFeather;
        this.canFly = canFly;
    }

    public String getCanFly() {
        return canFly;
    }

    public void setCanFly(String canFly) {
        this.canFly = canFly;
    }

    public String getAnimalWithFeather() {
        return animalWithFeather;
    }

    public void setAnimalWithFeather(String animalWithFeather) {
        this.animalWithFeather = animalWithFeather;
    }

    @Override
    public String showInfo() {
        return "Bird{" +
                "animalWithFeather='" + animalWithFeather + '\'' +
                ", canFly='" + canFly + '\'' +
                "} " + super.showInfo();
    }
}
