package com.methods;

public class Ep1MethodsInJava {
    public static void main(String[] args){
        loop();
        System.out.println("-----------");
        loop1(1,20);
    }
    public static void loop(){
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }
    public static void loop1(int start, int stop){
        for(; start<stop; start++){
            System.out.println(start);
        }
    }
}
