package com.example.seleniumproject.pages.polovniautomobili;

import com.example.seleniumproject.pages.Pageable;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Arrays;

import static com.example.seleniumproject.constants.polovniautomobili.PolovniAutomobiliPageLocators.POSTAVI_OGLAS_BUTTON_LOCATOR;
import static com.example.seleniumproject.constants.polovniautomobili.PolovniAutomobiliPageLocators.REGISTRUJ_SE_BUTTON_SECOND_LOCATOR;
import static com.example.seleniumproject.constants.polovniautomobili.URLPolovniAutomobili.*;
import static com.example.seleniumproject.methods.MainMethods.*;

@Slf4j
public class RegistracijaPage implements PageablePolovniAutomobili {
    WebDriver driver;
    private static RegistracijaPage instance;


    private RegistracijaPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.get(REGISTRACIJA_PAGE);
    }
    public static RegistracijaPage getInstance(WebDriver driver) {
        if (instance == null) {
            log.info("creating new instance of RegistracijaPage");
            instance = new RegistracijaPage(driver);
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

    @Override
    public PageablePolovniAutomobili clickOnCheckBox(By locator) {
        verifyElementIsPresent(locator);
        click(locator, driver);
        Assert.assertTrue(isSelected(driver, locator));
        return this;
    }

    @Override
    public PageablePolovniAutomobili verifyElementIsSelected(By element) {
        verifyElementIsPresent(element);
        isSelected(driver, element);
        return this;
    }

    @Override
    public PageablePolovniAutomobili clickOnPostaviOglasButton() {
        return null;
    }

    @Override
    public PageablePolovniAutomobili clickOnRegistrujSe() {
        verifyElementIsPresent(REGISTRUJ_SE_BUTTON_SECOND_LOCATOR);
        click(REGISTRUJ_SE_BUTTON_SECOND_LOCATOR, driver);
        Assert.assertTrue(isCurrentUrl(driver, USPESNA_REGISTRACIJA_PAGE));
        log.info("click on Registruj se on page {} leads to {} URL",REGISTRACIJA_PAGE, USPESNA_REGISTRACIJA_PAGE);
        return this;
    }
}
