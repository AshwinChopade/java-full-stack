package com.ep8InheritanceExample;

public class Eel extends Fish{
    private String release_electricShock;

    public Eel() {
        release_electricShock="yes";
    }

    public Eel(double height, double weight, String bloodType, String animalType, String liveInWater, String hasGills, String release_electricShock) {
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
