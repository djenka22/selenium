package com.example.seleniumproject.execute.thirdcase;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import com.example.seleniumproject.pages.polovniautomobili.LoginPage;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.polovniautomobili.PolovniAutomobiliPageLocators.*;
import static com.example.seleniumproject.constants.polovniautomobili.StandardUser.EMAIL_VERIFY;
import static com.example.seleniumproject.constants.polovniautomobili.StandardUser.PASSWORD;
import static com.example.seleniumproject.constants.polovniautomobili.URLPolovniAutomobili.HOME_PAGE;
import static com.example.seleniumproject.constants.polovniautomobili.URLPolovniAutomobili.LOGIN_PAGE;

public class SOSignInOnPolovniAutomobili {
    public void execute(WebDriver driver) {
        PageablePolovniAutomobili page = LoginPage.getInstance(driver);
        page
                .hoverOverElement(PRIJAVI_SE_LOCATOR, Assertion.ASSERT_ELEMENT_VISIBLE, PRIJAVI_SE_AFTER_HOVER_LOCATOR, LoginPage.class, driver)
                .handleClick(PRIJAVI_SE_AFTER_HOVER_LOCATOR, Assertion.ASSERT_URL, LOGIN_PAGE, LoginPage.class, driver)
                .sendKeyToElement(EMAIL_VERIFY, UNESI_EMAIL_LOCATOR, driver)
                .handleClick(DALJE_BUTTON_LOCATOR, Assertion.ASSERT_ELEMENT_VISIBLE, UNESI_LOZINKU_LOCATOR, LoginPage.class, driver)
                .sendKeyToElement(PASSWORD, UNESI_LOZINKU_LOCATOR, driver)
                .handleClick(PRIJAVI_SE_BUTTON_LOCATOR, Assertion.ASSERT_ELEMENT_VISIBLE, VERIFY_EMAIL_IS_CORRECT_AFTER_SIGN_IN, LoginPage.class, driver);
    }
}
