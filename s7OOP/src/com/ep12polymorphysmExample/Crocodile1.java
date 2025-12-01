package com.ep12polymorphysmExample;

public class Crocodile1 extends Reptile1 {
    private String hard_shelledEggs;

    public Crocodile1() {
        hard_shelledEggs="yes";
    }

    public Crocodile1(double height, double weight, String bloodType, String animalType, String backBone, String drySkin, String soft_shellEggs, String hard_shelledEggs) {
        super(height, weight, bloodType, animalType, backBone, drySkin, soft_shellEggs);
        this.hard_shelledEggs = hard_shelledEggs;
    }

    public String getHard_shelledEggs() {
        return hard_shelledEggs;
    }

    public void setHard_shelledEggs(String hard_shelledEggs) {
        this.hard_shelledEggs = hard_shelledEggs;
    }

    @Override
    public String showInfo() {
        return "Crocodile{" +
                "hard_shelledEggs='" + hard_shelledEggs + '\'' +
                "} " + super.showInfo();
    }
}
