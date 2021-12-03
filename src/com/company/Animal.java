package com.company;

import java.util.Random;

public class Animal {
    private int age = GenerateDefaultAge();
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }


    public Animal(int age,Color color) {
        this.age = age;
        this.color = color;
    }

    private int GenerateDefaultAge() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public String getInfo() {
        return "Age:" + age +
                "\nColor: " + color;
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }
    public void makeVoice(String voice,int count) {
        for (int i = 0; i < count; i++) {


            System.out.println(voice);
        }
    }
}