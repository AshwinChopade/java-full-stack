package com.ep12polymorphysmExample;

public class Reptile1 extends Animal1 {
    private String drySkin;
    private String backBone;
    private String soft_shellEggs;

    public Reptile1() {
        drySkin="yes";
        backBone="no";
        soft_shellEggs="yes";
    }

    public Reptile1(double height, double weight, String bloodType, String animalType, String backBone, String drySkin, String soft_shellEggs) {
        super(height, weight, bloodType, animalType);
        this.backBone = backBone;
        this.drySkin = drySkin;
        this.soft_shellEggs = soft_shellEggs;
    }

    public String getDrySkin() {
        return drySkin;
    }

    public void setDrySkin(String drySkin) {
        this.drySkin = drySkin;
    }

    public String getBackBone() {
        return backBone;
    }

    public void setBackBone(String backBone) {
        this.backBone = backBone;
    }

    public String getSoft_shellEggs() {
        return soft_shellEggs;
    }

    public void setSoft_shellEggs(String soft_shellEggs) {
        this.soft_shellEggs = soft_shellEggs;
    }

    @Override
    public String showInfo() {
        return "Reptile{" +
                "drySkin='" + drySkin + '\'' +
                ", backBone='" + backBone + '\'' +
                ", soft_shellEggs='" + soft_shellEggs + '\'' +
                "} " + super.showInfo();
    }
}
