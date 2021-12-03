package com.company;

public class Dog extends Animal {
    private String name;
    private String breed;
    private Color color;

    public Dog(String name, String breed, Color color) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
    }
//    public Dog( String name, String breed) {
//        this.name = name;
//        this.breed = breed;
//      super.getColor();
//    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed;
    }
}

