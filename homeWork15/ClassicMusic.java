package com.hillel.kucherenko.homeWork15;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println(this.getName() + " plays Classic-music!))");
    }
}
