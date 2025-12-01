package com.ep7InheritanceParametarizedConstructor;

public class Bike2 extends Vehicle2 {
    private String handle;

    public Bike2(){
        handle="Short";
    }

    public Bike2(String engine, int wheels, int fuelTank, int seats, String lights, String handle) {
        super(engine, wheels, fuelTank, seats, lights);
        this.handle = handle;
    }

    public String getHandle(){
        return handle;
    }

    public void setHandle(String handle){
        this.handle=handle;
    }



    @Override
    public String toString() {
        return "Bike2{" +
                "handle='" + handle + '\'' +
                "} " + super.toString();
    }
}
