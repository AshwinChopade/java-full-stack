package com.ep5ConstructorIntroduction;

public class Ep5Cars {
//    private String doors = "closed";
//    private String engine = "off";
//    private String driver = "away";
//    private int speed = 0;

    //above is one way of initializing variable but here in object oriented language we use constructor

    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public Ep5Cars(){                //No-Argument Constructor
        doors= "closed";
        engine= "off";
        driver= "away";
        speed= 0;
    }

    public Ep5Cars(String doors, String engine, String driver, int speed){            //Parameterized Constructor
        this.doors=doors;
        this.engine=engine;
        this.driver=driver;
        this.speed=speed;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //added functionality
    public String run1(){
        if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0){
            return "running";
        }
        else{
            return "not running";
        }
    }

}
