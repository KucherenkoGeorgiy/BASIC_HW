package com.hillel.kucherenko.homework16;

public enum DrinksMachine {
    COFFEE("Americano"),
    TEA("Green tea"),
    LIMONADE("Limonade"),
    MOJITO("Ice Mojito"),
    WATER("Borjomi"),
    COLA("Coca-Cola");
    private final String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
