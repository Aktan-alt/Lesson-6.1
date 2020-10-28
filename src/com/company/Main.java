package com.company;

public class Main {

    final Boolean hasEyes = true;

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(30);
        dog.setColor("red");
        dog.setBreed("Alabai");
        System.out.println(dog.getInfo());

        Dog dog2 = new Dog(45, "orange", "Chihuahua", "baaarg");
        dog2.Voice();
        System.out.println(dog2.getInfo());



        Cat cat = new Cat(9);
        cat.Voice();
        System.out.println(cat.getInfo() + " Lives:" + cat.getLives());
    }
	// write your code here
}