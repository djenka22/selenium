package com.example.seleniumproject.constants.polovniautomobili;

import java.util.Random;

public interface StandardUser {
    public static final String USER_NAME = "nikola.rusimovic+";
    public static final String DOMAIN_NAME = "@proton.me";
    public static final String EMAIL = setUserEmail();
    public static final String PASSWORD = "cokolada";
    private static String setUserEmail() {
        Random random = new Random();
        int rand = random.nextInt(999999);
        return USER_NAME + rand + DOMAIN_NAME;
    }
}
