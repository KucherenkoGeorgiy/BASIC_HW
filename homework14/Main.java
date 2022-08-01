package com.hillel.kucherenko.homework14;

public class Main {

    public static void main(String[] args) {
        Smartphones iphone1 = new Iphones("Iphone X");
        IOS iphone2 = new Iphones("Iphone 8");
        Smartphones samsung1 = new Androids("Samsung Galaxy");
        LinuxOS samsung2 = new Androids("Samsung Y");

        Smartphones[] mySmartPhones = {iphone1, samsung1};

        for (Smartphones smartphone : mySmartPhones) {
            smartphone.call();
            smartphone.sms();
            smartphone.internet();
        }

        System.out.println();

        iphone2.runIOSApp();
        samsung2.runLinuxApp();
    }
}
