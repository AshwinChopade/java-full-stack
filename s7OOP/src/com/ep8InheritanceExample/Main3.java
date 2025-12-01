package com.ep8InheritanceExample;

public class Main3 {
    public static void main(String[] args){

        Animal animal= new Animal(0.1, 0.1, "hot","Animal");
        System.out.println(animal.showInfo());

        Bird bird= new Bird(3.2,13.3,"cold","bird","yes","yes");
        System.out.println(bird.showInfo());

        Fish fish = new Fish(3.6, 17.5, "hot", "fish", "yes", "yes");
        System.out.println(fish.showInfo());

        Eagle eagle = new Eagle(5.5, 22.2, "hot", "bird","yes", "yes");
        System.out.println(eagle.showInfo());

        Crocodile crocodile = new Crocodile(4.2, 100.3, "hottest", "reptile", "no","yes", "yes","no");
        System.out.println(crocodile.showInfo());
    }
}
