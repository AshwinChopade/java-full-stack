package com.ep8InheritanceExample;

public class Fish extends Animal{
    private String liveInWater;
    private String hasGills;

    public Fish() {
        liveInWater="yes";
        hasGills="yes";
    }

    public Fish(double height, double weight, String bloodType, String animalType, String liveInWater, String hasGills) {
        super(height, weight, bloodType, animalType);
        this.liveInWater = liveInWater;
        this.hasGills = hasGills;
    }

    public String getLiveInWater() {
        return liveInWater;
    }

    public void setLiveInWater(String liveInWater) {
        this.liveInWater = liveInWater;
    }

    public String getHasGills() {
        return hasGills;
    }

    public void setHasGills(String hasGills) {
        this.hasGills = hasGills;
    }

    @Override
    public String showInfo() {
        return "Fish{" +
                "liveInWater='" + liveInWater + '\'' +
                ", hasGills='" + hasGills + '\'' +
                "} " + super.showInfo();
    }
}
