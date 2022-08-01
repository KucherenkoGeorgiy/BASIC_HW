package com.hillel.kucherenko.homeWork15;

public class PopMusic extends MusicStyles {

    public PopMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println(this.getName() + " plays Pop-music!))");
    }
}
