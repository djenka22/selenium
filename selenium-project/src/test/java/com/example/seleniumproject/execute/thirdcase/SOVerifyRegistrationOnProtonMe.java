package com.example.seleniumproject.execute.thirdcase;


import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.methods.MainMethods;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import com.example.seleniumproject.pages.polovniautomobili.KorisnickiProfilPage;
import com.example.seleniumproject.pages.polovniautomobili.RegistracijaUspesnaPage;
import com.example.seleniumproject.pages.protonme.*;
import org.openqa.selenium.WebDriver;


import static com.example.seleniumproject.constants.protonme.ProtonMePageLocators.*;
import static com.example.seleniumproject.constants.protonme.StandardUser.EMAIL;
import static com.example.seleniumproject.constants.protonme.StandardUser.PASSWORD;
import static com.example.seleniumproject.constants.protonme.URLProtonMe.*;


public class SOVerifyRegistrationOnProtonMe {

    public void execute(WebDriver driver) {
        MainMethods.switchTab(driver, HOME_PAGE);
        PageablePolovniAutomobili page = HomePage.getInstance(driver);
        page
                .handleClick(SIGH_IN_BUTTON_LOCATOR, Assertion.ASSERT_URL, LOGIN_PAGE, LoginPage.class, driver)
                .sendKeyToElement(EMAIL,EMAIL_INPUT_LOCATOR, driver)
                .sendKeyToElement(PASSWORD, PASSWORD_INPUT_LOCATOR, driver)
                .handleClick(SIGH_IN_BUTTON_LOCATOR_SECOND, Assertion.ASSERT_ELEMENT_VISIBLE, TEST, InboxPage.class, driver)
                .handleClick(INBOX_MESSAGE_LOCATOR, Assertion.ASSERT_ELEMENT_VISIBLE, INBOX_MESSAGE_ASSERTION_LOCATOR, MessagePage.class, driver)
                .handleClick(AKTIVACIONI_LINK_LOCATOR, Assertion.ASSERT_ELEMENT_VISIBLE, POP_UP_LOCATOR, PopUpPage.class, driver)
                .handleClick(POP_UP_LOCATOR, Assertion.ASSERT_URL, REGISTRACIJA_USPESNA, RegistracijaUspesnaPage.class, driver)
                .handleClick(POTVRDI_REGISTRACIJU_LOCATOR, Assertion.ASSERT_ELEMENT_VISIBLE, POP_UP_SECOND_LOCATOR, RegistracijaUspesnaPage.class, driver)
                .handleClick(POP_UP_SECOND_LOCATOR, Assertion.ASSERT_URL, KORISNICKI_PROFIL, KorisnickiProfilPage.class, driver);


    }
}
