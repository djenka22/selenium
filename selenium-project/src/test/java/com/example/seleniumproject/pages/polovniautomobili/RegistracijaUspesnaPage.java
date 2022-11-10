package com.example.seleniumproject.pages.polovniautomobili;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.polovniautomobili.URLPolovniAutomobili.REGISTRACIJA_USPESNA_PAGE;

@Slf4j
public class RegistracijaUspesnaPage implements PageablePolovniAutomobili {
    WebDriver driver;
    private static RegistracijaUspesnaPage instance;


    private RegistracijaUspesnaPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.get(REGISTRACIJA_USPESNA_PAGE);
    }
    public static RegistracijaUspesnaPage getInstance(WebDriver driver) {
        if (instance == null) {
            log.info("creating new instance of RegistracijaUspesnaPage");
            instance = new RegistracijaUspesnaPage(driver);
        }
        return instance;
    }

    @Override
    public PageablePolovniAutomobili verifyElementIsPresent(By element) {
        return null;
    }

    @Override
    public PageablePolovniAutomobili sendKeyToElement(String key, By element) {
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

    @Override
    public PageablePolovniAutomobili clickOnLoginButton(By locator) {
        return null;
    }

    @Override
    public PageablePolovniAutomobili justClick(By elementToClick, Assertion assertType, Object toAssert, Class pageToReturn) {
        return null;
    }
}
