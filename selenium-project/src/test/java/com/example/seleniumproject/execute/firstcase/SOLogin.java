package com.example.seleniumproject.execute.firstcase;


import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.pages.saucedemo.LoginPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;


import static com.example.seleniumproject.constants.firstandseconcase.LoginPageLocators.*;
import static com.example.seleniumproject.constants.firstandseconcase.StandardUser.PASSWORD;
import static com.example.seleniumproject.constants.firstandseconcase.StandardUser.USERNAME;
import static com.example.seleniumproject.constants.firstandseconcase.URLFirstAndSecondCase.INVENTORY_PAGE;

@Slf4j
public class SOLogin {
    private String pageURL;

    public SOLogin(String pageURL) {
        this.pageURL = pageURL;
    }

   public void execute(WebDriver driver) {
        LoginPage loginPage = LoginPage.getInstance(driver);
        loginPage.verifyElementIsPresent(USERNAME_LOCATOR)
                  .verifyElementIsPresent(PASSWORD_LOCATOR)
                  .verifyElementIsPresent(LOGIN_BUTTON_LOCATOR)
                  .sendKeyToElement(USERNAME, USERNAME_LOCATOR)
                  .sendKeyToElement(PASSWORD, PASSWORD_LOCATOR);
        loginPage
                  .justClick(LOGIN_BUTTON_LOCATOR, Assertion.ASSERT_URL, INVENTORY_PAGE, LoginPage.class);

    }
}
