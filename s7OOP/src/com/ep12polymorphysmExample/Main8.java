package com.ep12polymorphysmExample;

import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args){

        List<Animal1> animals = new ArrayList<>();
        Animal1 animal1 = new Animal1();
        Reptile1 reptile1 = new Reptile1();
        Animal1 croc = new Crocodile1();
        Fish1 eel = new Eel1();
        Animal1 bird = new Bird1();

        animals.add(animal1);
        animals.add(reptile1);
        animals.add(croc);
        animals.add(eel);
        animals.add(bird);


        listAnimals(animals);
    }

    private static void listAnimals(List<Animal1> animals) {
        for(Animal1 animal1: animals){
            System.out.println(animal1.showInfo());
        }
    }

}
