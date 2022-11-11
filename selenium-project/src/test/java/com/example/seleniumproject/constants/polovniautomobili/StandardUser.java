package com.example.seleniumproject.constants.polovniautomobili;

import java.util.Random;

public interface StandardUser {
    String USER_NAME = "nikola.rusimovic+";
    String DOMAIN_NAME = "@proton.me";
    String EMAIL = setUserEmail();
    String EMAIL_VERIFY = EMAIL;

    String PASSWORD = "cokolada";
    private static String setUserEmail() {
        Random random = new Random();
        int rand = random.nextInt(999999);
        return USER_NAME + rand + DOMAIN_NAME;
    }
}
