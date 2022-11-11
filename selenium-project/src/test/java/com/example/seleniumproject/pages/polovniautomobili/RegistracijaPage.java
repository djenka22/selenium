package com.example.seleniumproject.pages.polovniautomobili;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.methods.SpecificMethods;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
        if(!driver.getCurrentUrl().equals(REGISTRACIJA_PAGE)) {
            driver.get(REGISTRACIJA_PAGE);
        }
    }
    public static RegistracijaPage getInstance(WebDriver driver) {
        if (instance == null) {
            log.info("creating new instance of RegistracijaPage");
            instance = new RegistracijaPage(driver);
        }
        return instance;
    }

    @Override
    public PageablePolovniAutomobili verifyElementIsSelected(By element, WebDriver driver) {
        waitForElementToBeVisible(driver, element);
        SpecificMethods.isLabelSelected(driver, element);
        return this;
    }
}
