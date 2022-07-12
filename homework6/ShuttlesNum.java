package com.hillel.kucherenko.homework6;

public class ShuttlesNum {

    public static void main(String[] args) {
        printShuttles();
    }

    static void printShuttles() {
        int shutQty = 100;
        int curShutl = 0;
        int curIter = 0;
        int tempNumb;
        int checkNum;
        boolean isCorrect;
        while (shutQty != curShutl) {
            curIter++;
            checkNum = curIter;
            while (true) {
                if (checkNum != 0) {
                    tempNumb = checkNum % 10;
                    if ((tempNumb == 4) || (tempNumb == 9)) {
                        isCorrect = false;
                        break;
                    }
                    checkNum /= 10;
                } else {
                    isCorrect = true;
                    break;
                }
            }
            if (isCorrect) {
                System.out.println(curIter);
                curShutl++;
            }

        }

    }

}
