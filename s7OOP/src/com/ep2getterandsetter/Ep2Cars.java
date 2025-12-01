package com.ep2getterandsetter;

public class Ep2Cars {
    private int doors;
    private String engine;
    private String driver;
    private int speed;

    //above is class level member variable
    // public method can access member variable


    public void setDoors(int doors){
        this.doors= doors;
    }

    public int getDoors(){
        return doors;
    }
}
