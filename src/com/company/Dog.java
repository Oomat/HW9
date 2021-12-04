package com.company;

public class Dog extends Animal {
    private String name;
    private String breed;
    private String owner;
    public Dog(String name, String breed, Color color) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
    }
//    public Dog( String breed,String name,Color color,String owner) {
//        this.name = name;
//        this.breed = breed;
//        this.owner = owner;
//      super.setColor(color);
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

