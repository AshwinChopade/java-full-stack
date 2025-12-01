package com.ep12polymorphysmExample;

public class Animal1 {
    private double height;
    private double weight;
    private String animalType;
    private String bloodType;

    public Animal1() {
        height=0.1;
        weight=0.1;
        animalType="Animal";
        bloodType= "hot";
    }

    public Animal1(double height, double weight, String bloodType, String animalType) {
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
        this.animalType = animalType;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }


    public String showInfo() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
