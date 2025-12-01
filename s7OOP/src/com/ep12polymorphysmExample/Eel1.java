package com.ep12polymorphysmExample;

public class Eel1 extends Fish1 {
    private String release_electricShock;

    public Eel1() {
        release_electricShock="yes";
    }

    public Eel1(double height, double weight, String bloodType, String animalType, String liveInWater, String hasGills, String release_electricShock) {
        super(height, weight, bloodType, animalType, liveInWater, hasGills);
        this.release_electricShock = release_electricShock;
    }

    public String getRelease_electricShock() {
        return release_electricShock;
    }

    public void setRelease_electricShock(String release_electricShock) {
        this.release_electricShock = release_electricShock;
    }

    @Override
    public String showInfo() {
        return "Eel{" +
                "release_electricShock='" + release_electricShock + '\'' +
                "} " + super.showInfo();
    }
}
