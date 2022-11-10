package com.example.seleniumproject.pages.polovniautomobili;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.constants.polovniautomobili.URLPolovniAutomobili;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.example.seleniumproject.methods.MainMethods.*;

@Slf4j
public class UspesnaRegistracijaPage implements PageablePolovniAutomobili {
    WebDriver driver;
    private static UspesnaRegistracijaPage instance;


    private UspesnaRegistracijaPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.get(URLPolovniAutomobili.USPESNA_REGISTRACIJA_PAGE);
    }
    public static UspesnaRegistracijaPage getInstance(WebDriver driver) {
        if (instance == null) {
            log.info("creating new instance of HomePage");
            instance = new UspesnaRegistracijaPage(driver);
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
        verifyElementIsPresent(element);
        isSelected(driver, element);
        return this;
    }

    @Override
    public PageablePolovniAutomobili clickOnLoginButton(By locator) {
        return null;
    }

    @Override
    public PageablePolovniAutomobili justClick(By elementToClick, Assertion assertType, Object toAssert, Class pageToReturn) {
        return null;
    }
}
