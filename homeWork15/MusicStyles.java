package com.hillel.kucherenko.homeWork15;

public abstract class MusicStyles {
    private final String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    abstract void playMusic();

    public String getName() {
        return name;
    }
}
