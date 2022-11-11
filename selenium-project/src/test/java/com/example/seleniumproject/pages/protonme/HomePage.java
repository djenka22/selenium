package com.example.seleniumproject.pages.protonme;


import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.example.seleniumproject.constants.protonme.ProtonMePageLocators.SIGH_IN_BUTTON_LOCATOR;
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

}
