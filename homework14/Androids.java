package com.hillel.kucherenko.homework14;

public class Androids extends MobilePhone implements Smartphones, LinuxOS {

    public Androids(String name) {
        super(name);
    }

    public void call() {
        System.out.println(this.getName() + " making Call..");
    }

    public void sms() {
        System.out.println(this.getName() + " sending SMS..");
    }

    public void internet() {
        System.out.println(this.getName() + " making internet connection..");
    }

    public void runLinuxApp() {
        System.out.println(this.getName() + " starts Linux-Application..");
    }
}
