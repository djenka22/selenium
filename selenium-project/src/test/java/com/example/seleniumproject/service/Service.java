package com.example.seleniumproject.service;

import com.example.seleniumproject.execute.firstcase.special.SOVerifyLogoutIsPresent;
import com.example.seleniumproject.execute.firstcase.special.SOLogin;
import com.example.seleniumproject.execute.main.SOSetUp;
import com.example.seleniumproject.execute.main.SOVerifyElementIsPresent;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.firstandseconcase.InventoryPageLocators.*;

@Slf4j
public class Service {
    private WebDriver driver;

    public void setUp(String browser) {
        SOSetUp setUp = new SOSetUp();
        setUp.execute(browser);
        driver = setUp.getDriver();
    }
    public void login(String pageURL) {
        SOLogin soLogin = new SOLogin(pageURL);
        soLogin.execute(driver);
    }

    public void verifyHeaderIsPresent(String pageURL) {
        SOVerifyElementIsPresent soVerify = new SOVerifyElementIsPresent(pageURL);
        soVerify.execute(driver, pageURL, HEADER_LOCATOR);
    }

    public void verifyShoppingCartIsPresent(String pageURL) {
        SOVerifyElementIsPresent soVerify = new SOVerifyElementIsPresent(pageURL);
        soVerify.execute(driver, pageURL, SHOPPING_CART_LOCATOR);
    }

    public void verifyTwitterFacebookAndLinkedinArePresent(String pageURL) {
        SOVerifyElementIsPresent soVerify = new SOVerifyElementIsPresent(pageURL);
        soVerify.execute(driver, pageURL, TWITTER_LOCATOR, FACEBOOK_LOCATOR, LINKEDIN_LOCATOR);
    }

    public void verifyBurgerMenuIsPresent(String pageURL) {
        SOVerifyElementIsPresent soVerify = new SOVerifyElementIsPresent(pageURL);
        soVerify.execute(driver, pageURL, BURGER_MENU_LOCATOR);
    }

    public void verifyLogoutIsPresent(String pageURL) {
        verifyBurgerMenuIsPresent(pageURL);
        SOVerifyLogoutIsPresent soVerifyLogoutIsPresent = new SOVerifyLogoutIsPresent(pageURL);
        soVerifyLogoutIsPresent.execute(driver);
    }

    public void tearDown() {
        driver.quit();
    }
}
