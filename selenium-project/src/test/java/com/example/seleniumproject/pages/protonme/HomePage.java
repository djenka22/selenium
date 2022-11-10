package com.example.seleniumproject.pages.protonme;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.example.seleniumproject.constants.protonme.URLProtonMe.HOME_PAGE;
import static com.example.seleniumproject.constants.protonme.URLProtonMe.LOGIN_PAGE;
import static com.example.seleniumproject.methods.MainMethods.*;


@Slf4j
public class HomePage implements PageablePolovniAutomobili {
    WebDriver driver;
    private static HomePage instance;


    private HomePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        if(!driver.getCurrentUrl().equals(HOME_PAGE)) {
            driver.get(HOME_PAGE);
        }
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
        return null;
    }

    @Override
    public PageablePolovniAutomobili clickOnLoginButton(By locator) {
        verifyElementIsPresent(locator);
        click(locator, driver);
        Assert.assertTrue(isCurrentUrl(driver, LOGIN_PAGE));
        return LoginPage.getInstance(driver);
    }

    @Override
    public PageablePolovniAutomobili justClick(By elementToClick, Assertion assertType, Object toAssert, Class pageToReturn) {
        return null;
    }

    @Override
    public PageablePolovniAutomobili clickOnPostaviOglasButton() {
        return null;
    }

    @Override
    public PageablePolovniAutomobili clickOnRegistrujSe() {
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
