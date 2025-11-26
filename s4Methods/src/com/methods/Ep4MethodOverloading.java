package com.methods;

public class Ep4MethodOverloading {
    public static void main(String[] args){
        area(6.5,7.0);
        area(6,7);
        area(6,5);
        area(7.3,5.0);
    }
    public static void area(double height,double width){
        System.out.println("area of 2 double");
    }
    public static void area(int height,double width){
        System.out.println("area of 1 int 1 double");
    }
    public static void area(double height,int width){
        System.out.println("area of 1 double 1 int");
    }
    public static void area(int height,int width){
        System.out.println("area of 2 int");
    }

    //can create as much as want overloading method
}
