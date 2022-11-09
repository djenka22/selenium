package com.example.seleniumproject.execute.thirdcase;

import com.example.seleniumproject.constants.polovniautomobili.PolovniAutomobiliPageLocators;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import com.example.seleniumproject.pages.polovniautomobili.HomePage;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.polovniautomobili.PolovniAutomobiliPageLocators.*;
import static com.example.seleniumproject.constants.polovniautomobili.StandardUser.EMAIL;
import static com.example.seleniumproject.constants.polovniautomobili.StandardUser.PASSWORD;

public class SORegisterOnPolovniAutomobili {

    public void execute(WebDriver driver) {
        PageablePolovniAutomobili page = HomePage.getInstance(driver);
        page
                .clickOnPostaviOglasButton()
                .clickOnRegistrujSe()
                .sendKeyToElement(EMAIL, EMAIL_ADRESA_INPUT_LOCATOR)
                .sendKeyToElement(PASSWORD, LOZINKA_FIRST_INPUT_LOCATOR)
                .sendKeyToElement(PASSWORD, LOZINKA_SECOND_INPUT_LOCATOR)
                .clickOnCheckBox(RADIO_BUTTON_FIRST_LOCATOR)
                .clickOnCheckBox(RADIO_BUTTON_SECOND_LOCATOR)
                .clickOnCheckBox(RADIO_BUTTON_THIRD_LOCATOR)
                .verifyElementIsSelected(EMAIL_POTVRDA_LOCATOR)
                .clickOnRegistrujSe()
                .verifyElementIsPresent(HVALA_NA_REGISTRACIJI_LOCATOR);
    }
}
