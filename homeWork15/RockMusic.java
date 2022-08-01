package com.hillel.kucherenko.homeWork15;

public class RockMusic extends MusicStyles {

    public RockMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println(this.getName() + " plays Rock-music!))");
    }
}
