package com.hillel.kucherenko.homework5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        String  teamA;
        String  teamB;
        int     fragsA1;
        int     fragsA2;
        int     fragsA3;
        int     fragsA4;
        int     fragsA5;
        int     fragsB1;
        int     fragsB2;
        int     fragsB3;
        int     fragsB4;
        int     fragsB5;
        double  srednA;
        double  srednB;
        int     totalA;
        int     totalB;

        teamA = createTeam();
        System.out.println("Введите пять целочисленных значений фрагов игроков");
        fragsA1 = addFrags();
        fragsA2 = addFrags();
        fragsA3 = addFrags();
        fragsA4 = addFrags();
        fragsA5 = addFrags();

        teamB = createTeam();
        System.out.println("Введите пять целочисленных значений фрагов игроков");
        fragsB1 = addFrags();
        fragsB2 = addFrags();
        fragsB3 = addFrags();
        fragsB4 = addFrags();
        fragsB5 = addFrags();

        srednA = countAverageFrags(fragsA1, fragsA2, fragsA3, fragsA4, fragsA5);
        srednB = countAverageFrags(fragsB1, fragsB2, fragsB3, fragsB4, fragsB5);
        totalA = countTotFrags(fragsA1, fragsA2, fragsA3, fragsA4, fragsA5);
        totalB = countTotFrags(fragsB1, fragsB2, fragsB3, fragsB4, fragsB5);

        System.out.println("Среднее арифметическое очков команды " + teamA
                            + " составляет: " + srednA);

        System.out.println("Среднее арифметическое очков команды " + teamB
                            + " составляет: " + srednB);

        if (srednA > srednB){
            System.out.println("Победила команда " + teamA + " набравшая "
                                + totalA + " очков");
        } else if (srednA < srednB) {
            System.out.println("Победила команда " + teamB + " набравшая "
                                + totalB + " очков");
        } else {
            System.out.println("Ничья! Обе команды набрали " + totalA + " очков");
        }
    }


    static String createTeam(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя комманды");
        return sc.nextLine();
    }


    static int addFrags(){
        Scanner sc = new Scanner(System.in);

        if (!(sc.hasNextInt())){
            System.out.println("Вы ввели некорректные данные.. программа закрывается");
            System.exit(0);
        }

        return sc.nextInt();
    }


    static double countAverageFrags(int player1, int player2, int player3,
                                    int player4, int player5){
        double tempAver = (double) (player1 + player2 + player3 + player4
                                    + player5) / 5 * 10;
        return (double) Math.round(tempAver) / 10;
    }


    static int countTotFrags (int player1, int player2, int player3,
                              int player4, int player5){
        return player1 + player2 + player3 + player4 + player5;
    }

}
