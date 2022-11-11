package com.example.seleniumproject.execute.thirdcase;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.constants.polovniautomobili.PolovniAutomobiliPageLocators;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import com.example.seleniumproject.pages.polovniautomobili.HomePage;
import com.example.seleniumproject.pages.polovniautomobili.LoginPage;
import com.example.seleniumproject.pages.polovniautomobili.RegistracijaPage;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.polovniautomobili.PolovniAutomobiliPageLocators.*;
import static com.example.seleniumproject.constants.polovniautomobili.StandardUser.EMAIL;
import static com.example.seleniumproject.constants.polovniautomobili.StandardUser.PASSWORD;
import static com.example.seleniumproject.constants.polovniautomobili.URLPolovniAutomobili.*;

public class SORegisterOnPolovniAutomobili {

    public void execute(WebDriver driver) {
        PageablePolovniAutomobili page = HomePage.getInstance(driver);
        page
                .handleClick(POSTAVI_OGLAS_BUTTON_LOCATOR, Assertion.ASSERT_URL, LOGIN_PAGE, LoginPage.class, driver)
                .handleClick(REGISTRUJ_SE_BUTTON_FIRST_LOCATOR, Assertion.ASSERT_URL, REGISTRACIJA_PAGE, RegistracijaPage.class, driver)
                .sendKeyToElement(EMAIL, EMAIL_ADRESA_INPUT_LOCATOR, driver)
                .sendKeyToElement(PASSWORD, LOZINKA_FIRST_INPUT_LOCATOR, driver)
                .sendKeyToElement(PASSWORD, LOZINKA_SECOND_INPUT_LOCATOR, driver)
                .handleClick(RADIO_BUTTON_FIRST_LOCATOR, Assertion.ASSERT_ELEMENT_SELECTED, RADIO_BUTTON_FIRST_LOCATOR, RegistracijaPage.class, driver)
                .handleClick(RADIO_BUTTON_SECOND_LOCATOR, Assertion.ASSERT_ELEMENT_SELECTED, RADIO_BUTTON_SECOND_LOCATOR, RegistracijaPage.class, driver)
                .handleClick(RADIO_BUTTON_THIRD_LOCATOR, Assertion.ASSERT_ELEMENT_SELECTED, RADIO_BUTTON_THIRD_LOCATOR, RegistracijaPage.class, driver)
                .verifyElementIsSelected(EMAIL_POTVRDA_LOCATOR, driver)
                .handleClick(REGISTRUJ_SE_BUTTON_SECOND_LOCATOR, Assertion.ASSERT_URL, USPESNA_REGISTRACIJA_PAGE, RegistracijaPage.class, driver)
                .verifyElementIsVisible(HVALA_NA_REGISTRACIJI_LOCATOR, driver);
    }
}
