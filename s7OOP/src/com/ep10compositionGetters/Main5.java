package com.ep10compositionGetters;

public class Main5 {
    public static void main(String[] args){
        Laptop1 laptop = new Laptop1();
        System.out.println(laptop.getGraphicCard().getBrand());

        //if we want to use parameterized constructor or call parameterized constructor then
        Processor1 pr = new Processor1();    //default
        GraphicsCard1 gc = new GraphicsCard1();     //default
        Laptop1 lp = new Laptop1(13.2f, pr,"6GB", "1TB", gc, "Single Layer", "Black List" );

        System.out.println(lp);

    }
}
