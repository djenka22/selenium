package com.example.seleniumproject.constants;

import org.openqa.selenium.By;

public interface InventoryPageLocators {

    public static final By HEADER_LOCATOR = By.className("header_secondary_container");
    public static final By SHOPPING_CART_LOCATOR = By.className("shopping_cart_link");
    public static final By TWITTER_LOCATOR = By.linkText("Twitter");
    public static final By FACEBOOK_LOCATOR = By.linkText("Facebook");
    public static final By LINKEDIN_LOCATOR = By.linkText("LinkedIn");
    public static final By BURGER_MENU_LOCATOR = By.id("react-burger-menu-btn");
    public static final By LOGOUT_LOCATOR = By.id("logout_sidebar_link");
}
