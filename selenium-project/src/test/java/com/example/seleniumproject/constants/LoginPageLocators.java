package com.example.seleniumproject.constants;

import org.openqa.selenium.By;

public interface LoginPageLocators {
    public static final By USERNAME_LOCATOR = By.name("user-name");
    public static final By PASSWORD_LOCATOR = By.id("password");
    public static final By LOGIN_BUTTON_LOCATOR = By.id("login-button");
}
