package com.example.seleniumproject.pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.example.seleniumproject.constants.LoginPageLocators.*;
import static com.example.seleniumproject.constants.url.URLFirstAndSecondCase.INVENTORY_PAGE;
import static com.example.seleniumproject.constants.url.URLFirstAndSecondCase.LOGIN_PAGE;
import static com.example.seleniumproject.methods.MainMethods.*;

@Slf4j
public class LoginPage implements Pageable {
    WebDriver driver;
    private static LoginPage instance;


    private LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get(LOGIN_PAGE);
    }
    public static LoginPage getInstance(WebDriver driver) {
        if (instance == null) {
            log.info("creating new instance of LoginPage");
            instance = new LoginPage(driver);
        }
        return instance;
    }

    @Override
    public Pageable verifyElementIsPresent(By element) {
        log.info("waiting for {} element to be visible", element);
        waitForElementToBeVisible(driver, element);
        return this;
    }

    @Override
    public Pageable sendKeyToElement(String key, By element) {
        sendKeyToElementMethod(key, element, driver);
        Assert.assertEquals(driver.findElement(element).getAttribute("value"), key);
        return this;
    }

    public LoginPage clickOnLoginButton() {
        click(LOGIN_BUTTON_LOCATOR, driver);
        Assert.assertEquals(driver.getCurrentUrl(), INVENTORY_PAGE);
        return this;
    }


}
