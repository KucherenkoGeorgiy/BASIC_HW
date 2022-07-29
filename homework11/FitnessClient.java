package com.hillel.kucherenko.homework11;

public class FitnessClient {

    private final String USERS_FIRST_NAME;
    private String usersLastName;
    private final int USERS_BIRTH_DATE;
    private final String USERS_BIRTH_MONTH;
    private final int USERS_BIRTH_YEAR;
    private final String USERS_CELL_PHONE;
    private final String USERS_EMAIL;
    double usersWeight;
    String usersPressure;
    int usersStepsCounter;
    private final int USERS_AGE;

    public FitnessClient(String USERS_FIRST_NAME, String usersLastName, int USERS_BIRTH_DATE,
                         String USERS_BIRTH_MONTH, int USERS_BIRTH_YEAR, String USERS_CELL_PHONE,
                         String USERS_EMAIL, double usersWeight, String usersPressure,
                         int usersStepsCounter) {
        this.USERS_FIRST_NAME = USERS_FIRST_NAME;
        this.usersLastName = usersLastName;
        this.USERS_BIRTH_DATE = USERS_BIRTH_DATE;
        this.USERS_BIRTH_MONTH = USERS_BIRTH_MONTH;
        this.USERS_BIRTH_YEAR = USERS_BIRTH_YEAR;
        this.USERS_CELL_PHONE = USERS_CELL_PHONE;
        this.USERS_EMAIL = USERS_EMAIL;
        this.usersWeight = usersWeight;
        this.usersPressure = usersPressure;
        this.usersStepsCounter = usersStepsCounter;
        this.USERS_AGE = 2020 - USERS_BIRTH_YEAR;
    }

    public String getUSERS_FIRST_NAME() {
        return USERS_FIRST_NAME;
    }

    public int getUSERS_BIRTH_DATE() {
        return USERS_BIRTH_DATE;
    }

    public String getUSERS_BIRTH_MONTH() {
        return USERS_BIRTH_MONTH;
    }

    public int getUSERS_BIRTH_YEAR() {
        return USERS_BIRTH_YEAR;
    }

    public String getUSERS_CELL_PHONE() {
        return USERS_CELL_PHONE;
    }

    public String getUSERS_EMAIL() {
        return USERS_EMAIL;
    }

    public int getUSERS_AGE() {
        return USERS_AGE;
    }

    public void setUsersLastName(String usersLastName) {
        this.usersLastName = usersLastName;
    }

    public String getUsersLastName() {
        return usersLastName;
    }
}
