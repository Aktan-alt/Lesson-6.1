package com.company;

import javax.sound.midi.VoiceStatus;

public class Cat extends Animal {

    private int Lives;

    public int getLives() {
        return Lives;
    }

    public Cat(int Lives){
        super();
        this.Lives = Lives;



    }

    @Override
    public void Voice() {
        System.out.println("Tralalalalaal");
    }
}
