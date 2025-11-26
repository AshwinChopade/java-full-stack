package com.methods;

public class Ep3MethodOverloading {
    public static void main(String[] args){
        System.out.println("area of square using 2 double side: "+ area(6.5,7.0));
        System.out.println("area of square using 2 int side: "+ area(6,7));
        System.out.println("area of square using 1 double side: "+ area(6));
        System.out.println("area of square using 1 int side: "+ area(7.3));
    }
    public static double area(double height,double width){      // here here java can automatically change double into int
        return height*width;
    }
    public static int area(int side){
        return side*side;
    }
    public static double area(double side){
        return side*side;
    }

}
