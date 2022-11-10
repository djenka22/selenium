package com.example.seleniumproject.execute.thirdcase;


import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.methods.MainMethods;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import com.example.seleniumproject.pages.protonme.HomePage;
import com.example.seleniumproject.pages.protonme.InboxPage;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.protonme.ProtonMePageLocators.*;
import static com.example.seleniumproject.constants.protonme.StandardUser.EMAIL;
import static com.example.seleniumproject.constants.protonme.StandardUser.PASSWORD;
import static com.example.seleniumproject.constants.protonme.URLProtonMe.HOME_PAGE;


public class SOVerifyRegistrationOnProtonMe {

    public void execute(WebDriver driver) {
        MainMethods.switchTab(driver, HOME_PAGE);
        PageablePolovniAutomobili page = HomePage.getInstance(driver);
        page
                .clickOnLoginButton(SIGH_IN_BUTTON_LOCATOR)
                .sendKeyToElement(EMAIL,EMAIL_INPUT_LOCATOR)
                .sendKeyToElement(PASSWORD, PASSWORD_INPUT_LOCATOR)
                .justClick(SIGH_IN_BUTTON_LOCATOR_SECOND, Assertion.ASSERT_ELEMENT_VISIBLE, TEST, InboxPage.class)
                .justClick(INBOX_MESSAGE_LOCATOR, Assertion.ASSERT_ELEMENT_VISIBLE, INBOX_MESSAGE_ASSERTION_LOCATOR, InboxPage.class);


    }
}
