package com.hillel.kucherenko.homework11;

public class FitnessTracker {

    public static void main(String[] args) {
        FitnessClient client1 = new FitnessClient("Georgiy",
                "Kucherenko", 30, "August",
                1986, "099-955-55-79", "georgiy.kucherenko@gmail.com",
                67, "120 / 80", 8000);
        FitnessClient client2 = new FitnessClient("Ivan",
                "Ivanov", 15, "June",
                1987, "067-344-85-12", "ivan.ivanov@gmail.com",
                77, "111 / 78", 5500);
        FitnessClient client3 = new FitnessClient("Ann",
                "Petrova", 2, "December",
                1989, "068-165-44-85", "ann.petrova@gmail.com",
                48, "125 / 85", 12352);
        FitnessClient client4 = new FitnessClient("Sergey",
                "Sidorov", 22, "March",
                1993, "050-000-59-11", "sergey.sidorov@gmail.com",
                65, "122 / 79", 4522);
        FitnessClient client5 = new FitnessClient("Petr",
                "Sergeev", 24, "February",
                1975, "095-674-15-67", "petr.sergeev.com",
                84, "121 / 79", 7890);

        System.out.println();
        printAccountInfo(client1);
        printAccountInfo(client2);
        printAccountInfo(client3);
        printAccountInfo(client4);
        printAccountInfo(client5);
        System.out.println("\nMaking some changes to 3 first Clients..:");

        client1.usersStepsCounter += 1500;
        client1.usersPressure = "135 / 91";
        client1.usersWeight = 66.8;
        printAccountInfo(client1);

        client2.usersStepsCounter += 2123;
        client2.usersPressure = "119 / 83";
        client2.usersWeight = 75.9;
        printAccountInfo(client2);

        client3.usersStepsCounter += 981;
        client3.usersPressure = "129 / 87";
        client3.usersWeight = 46.3;
        client3.setUsersLastName("Adamenko");
        printAccountInfo(client3);
    }

    static void printAccountInfo(FitnessClient fitnessClient) {
        String accountInfo;
        accountInfo = fitnessClient.getUSERS_FIRST_NAME() + " " + fitnessClient.getUsersLastName() + ", "
                + fitnessClient.getUSERS_BIRTH_DATE() + " " + fitnessClient.getUSERS_BIRTH_MONTH()
                + " " + fitnessClient.getUSERS_BIRTH_YEAR() + ", age: " + fitnessClient.getUSERS_AGE()
                + ", " + fitnessClient.getUSERS_CELL_PHONE()
                + ", " + fitnessClient.getUSERS_EMAIL() + ", weight: " + fitnessClient.usersWeight
                + " kg, pressure: " + fitnessClient.usersPressure + ", steps quantity: "
                + fitnessClient.usersStepsCounter;
        System.out.println(accountInfo);
    }


}
