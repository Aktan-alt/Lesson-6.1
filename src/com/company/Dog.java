package com.company;

public class Dog extends Animal {

    public String Command;

    public Dog(){

    }

    public Dog(int age, String color, String breed, String command) {
        super(age, color, breed);
        this.Command = command;
    }
    public String getInfo(){
        return super.getInfo() + " " + Command;
    }

    public String getCommand() {
        return Command;
    }

    public void setCommand(String command) {
        Command = command;
    }

    @Override
    public void Voice() {
        System.out.println("Truhhhh");
    }
}
