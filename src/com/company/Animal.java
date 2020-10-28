package com.company;

public class Animal {
    private int age;
    private String color;
    private String breed;


    public Animal(){

    }

    public Animal(int age, String color, String breed) {
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getInfo(){
        return "Age: " + getAge() + " Color:" + getColor() + " Breed: " + getBreed();
    }
    public void Voice(){

    }
}
