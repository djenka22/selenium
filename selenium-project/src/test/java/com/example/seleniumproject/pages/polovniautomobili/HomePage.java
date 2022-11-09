package com.example.seleniumproject.pages.polovniautomobili;

import com.example.seleniumproject.pages.Pageable;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.example.seleniumproject.constants.polovniautomobili.PolovniAutomobiliPageLocators.POSTAVI_OGLAS_BUTTON_LOCATOR;
import static com.example.seleniumproject.constants.polovniautomobili.URLPolovniAutomobili.*;
import static com.example.seleniumproject.methods.MainMethods.*;

@Slf4j
public class HomePage implements PageablePolovniAutomobili  {
    WebDriver driver;
    private static HomePage instance;


    private HomePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);
    }
    public static HomePage getInstance(WebDriver driver) {
        if (instance == null) {
            log.info("creating new instance of HomePage");
            instance = new HomePage(driver);
        }
        return instance;
    }

    @Override
    public PageablePolovniAutomobili verifyElementIsPresent(By element) {
        log.info("waiting for {} element to be visible", element);
        waitForElementToBeVisible(driver, element);
        return this;
    }

    @Override
    public PageablePolovniAutomobili sendKeyToElement(String key, By element) {
        verifyElementIsPresent(element);
        sendKeyToElementMethod(key, element, driver);
        Assert.assertEquals(driver.findElement(element).getAttribute("value"), key);
        return this;
    }
    public PageablePolovniAutomobili clickOnPostaviOglasButton() {
        verifyElementIsPresent(POSTAVI_OGLAS_BUTTON_LOCATOR);
        click(POSTAVI_OGLAS_BUTTON_LOCATOR, driver);
        Assert.assertTrue(isCurrentUrl(driver, LOGIN_PAGE));
        log.info("click on Postavi Oglas leads to {} URL", LOGIN_PAGE);
        return LoginPage.getInstance(driver);
    }

    @Override
    public RegistracijaPage clickOnRegistrujSe() {
        return null;
    }

    @Override
    public PageablePolovniAutomobili clickOnCheckBox(By locator) {
        return null;
    }

    @Override
    public PageablePolovniAutomobili verifyElementIsSelected(By element) {
        return null;
    }

}
