package com.hillel.kucherenko.homework14;

public class Iphones extends MobilePhone implements Smartphones, IOS {

    public Iphones(String name) {
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

    public void runIOSApp() {
        System.out.println(this.getName() + " starts IOS-Application..");
    }
}
