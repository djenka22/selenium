package com.example.seleniumproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.example.seleniumproject.constants.InventoryPageLocators.*;
import static com.example.seleniumproject.constants.url.URLFirstAndSecondCase.INVENTORY_PAGE;
import static com.example.seleniumproject.constants.url.URLFirstAndSecondCase.LOGIN_PAGE;
import static com.example.seleniumproject.methods.MainMethods.*;

public class InventoryPage implements Pageable {
    private WebDriver driver;
    private static InventoryPage instance;
    private InventoryPage(WebDriver driver) {
        this.driver = driver;
        driver.get(INVENTORY_PAGE);
    }
    public static InventoryPage getInstance(WebDriver driver) {
        if(instance == null) {
            instance = new InventoryPage(driver);
        }
        return instance;
    }
    @Override
    public Pageable verifyElementIsPresent(By element) {
        waitForElementToBeVisible(driver, element);
        return this;
    }
    @Override
    public Pageable sendKeyToElement(String key, By element) {
        sendKeyToElementMethod(key, element, driver);
        Assert.assertEquals(driver.findElement(element).getAttribute("value"), key);
        return this;
    }

    public InventoryPage clickOnBurgerMenu() {
        click(BURGER_MENU_LOCATOR, driver);
        waitForElementToBeVisible(driver, LOGOUT_LOCATOR);
        return this;
    }
    public InventoryPage clickOnLogout() {
        click(LOGOUT_LOCATOR, driver);
        Assert.assertEquals(driver.getCurrentUrl(), LOGIN_PAGE);
        return this;
    }


}
