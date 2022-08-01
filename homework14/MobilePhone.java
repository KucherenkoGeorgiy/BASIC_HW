package com.hillel.kucherenko.homework14;

abstract class MobilePhone {
    private final String name;

    public MobilePhone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
