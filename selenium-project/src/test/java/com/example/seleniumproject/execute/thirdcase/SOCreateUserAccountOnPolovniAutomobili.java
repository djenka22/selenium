package com.example.seleniumproject.execute.thirdcase;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import com.example.seleniumproject.pages.polovniautomobili.KorisnickiProfilPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.polovniautomobili.PolovniAutomobiliPageLocators.*;

import static com.example.seleniumproject.constants.polovniautomobili.UserAccountDetails.*;

@Slf4j
public class SOCreateUserAccountOnPolovniAutomobili {


    public void execute(WebDriver driver) {
        PageablePolovniAutomobili page = KorisnickiProfilPage.getInstance(driver);
        page
                .sendKeyToElement(IME, NAME_LOCATOR, driver)
                .sendKeyToElement(PREZIME, SURNAME_LOCATOR, driver)
                .sendKeyToElement(ADRESA, ADDRESS_LOCATOR, driver)
                .sendKeyToElement(GRAD, CITY_LOCATOR, driver)
                .handleClick(REGION_LOCATOR, Assertion.ASSERT_ELEMENT_VISIBLE, REGION_CONFIRM_LOCATOR, KorisnickiProfilPage.class, driver)
                .sendKeyToElement(ZIP_CODE, ZIP_CODE_LOCATOR, driver)
                .sendKeyToElement(BROJ_TELEFONA, PHONE_LOCATOR, driver)
                .verifyElementIsVisible(STATE_LOCATOR, driver)
                .handleClick(SAVE_BUTTON_LOCATOR, Assertion.ASSERT_ELEMENT_VISIBLE, SUCCESS_ALERT, KorisnickiProfilPage.class, driver)
                .hoverOverElement(MY_PROFILE_LOCATOR, Assertion.ASSERT_ELEMENT_VISIBLE, ODJAVI_SE_LOCATOR, KorisnickiProfilPage.class, driver)
                .handleClick(ODJAVI_SE_LOCATOR, Assertion.ASSERT_ELEMENT_VISIBLE, PRIJAVI_SE_LOCATOR, KorisnickiProfilPage.class, driver);

    }
}
