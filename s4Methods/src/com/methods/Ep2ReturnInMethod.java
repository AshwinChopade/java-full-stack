package com.methods;

public class Ep2ReturnInMethod {
    public static void main(String[] args){
        area(5,5);
        System.out.println("---after using return---");
        System.out.println("area of shape"+area1(6,5));
    }

    public static void area(int height, int width){
        System.out.println("area of rect:"+ height*width);
    }
    //here void means printing not returning value
    // if we return the value in method we can customize it while calling
    //ex. if we dont want to print same msg everytime we use return

    public static int area1(int height, int width){
        return height*width;
    }
}
