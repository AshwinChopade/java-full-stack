package com.ep7InheritanceGetterSetter;

public class Bike1 extends Vehicle1 {
    private String handle;

    public Bike1(){
        handle="Short";
    }

    public String getHandle(){
        return handle;
    }

    public void setHandle(String handle){
        this.handle=handle;
    }
}
