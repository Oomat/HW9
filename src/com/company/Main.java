package com.company;

public class Main {

    public static void main(String[] args) {
        Dog objectA = new Dog("Rex","Ovcharka",Color.BROWN);
        System.out.println(objectA.getInfo());
        objectA.makeVoice("Gav-Gav",4);
            System.out.println("============");
        Cat objectB = new Cat("Gora","Bare",Color.BLACK);
        System.out.println(objectB.getInfo());
        objectB.makeVoice("Maw maw");
            System.out.println("--------------------");
        Cat objectC = new Cat("Rock","Wool",Color.GRAY);
        System.out.println(objectC.getInfo());
        objectC.makeVoice(" Maw",3);
    }
}
