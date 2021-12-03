package com.company;

public final class Cat extends Animal {
private String name;
private String breed;
Color color;
public Cat(String name,String breed,Color color){
    this.name = name;
    this.breed = breed;
    super.setColor(color);
}
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
    public String getInfo(){
        return super.getInfo() +
                "\nName: " + name+
                "\nBreed: "+ breed;
    }
}
