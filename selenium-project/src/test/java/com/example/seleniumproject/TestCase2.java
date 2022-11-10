package com.example.seleniumproject;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;
import static com.example.seleniumproject.constants.firstandseconcase.URLFirstAndSecondCase.*;
import static org.testng.Assert.assertEquals;



@Slf4j
public class TestCase2 {
    public static WebDriver driver;
    public static WebDriverWait waitDriver;

    @BeforeClass
    public static void setDriver() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        waitDriver = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }


    @Test(priority = 1)
    public void loginWithUsernameAndPassword() {
        log.info("Inside loginWithUsernameAndPassword method");

        log.info("opening web page");
        driver.get(LOGIN_PAGE);
        log.info("web page opened successfully");

        log.info("waiting for username, password and login button elements to be visible");

        /* ili uz pomoc By lokatora */
        waitDriver.until(ExpectedConditions.visibilityOfAllElements(
                List.of(driver.findElement(By.name("user-name")),
                        driver.findElement(By.id("password")),
                        driver.findElement(By.id("login-button")))));
        log.info("elements are visible");

        log.info("sending keys to username and password fields");
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        log.info("click on login button");
        driver.findElement(By.id("login-button")).click();
        log.info("Login successful");

        waitDriver.until(ExpectedConditions.urlToBe(INVENTORY_PAGE));
        assertEquals(driver.getCurrentUrl(),INVENTORY_PAGE);
        log.info("Login button click leads to {}", INVENTORY_PAGE);
    }
    @Test(priority = 2)
    public void clickOnTheSauceLabsBackpackItem() {
         /*
            loginWithUsernameAndPassword() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(INVENTORY_PAGE);
        log.info("waiting for Sauce Labs Backpack element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_item_name")));
        log.info("Sauce Labs Backpack element is visible");
        log.info("click on Sauce Labs Backpack");
        driver.findElement(By.className("inventory_item_name")).click();
        log.info("click is successful");
        waitDriver.until(ExpectedConditions.urlToBe(SAUCE_LABS_BACKPACK_PAGE));
        log.info("click leads to {} page", SAUCE_LABS_BACKPACK_PAGE);
    }
    @Test(priority = 3)
    public void verifyTitleElementIsVisible() {
         /*
            clickOnTheSauceLabsBackpackItem() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(SAUCE_LABS_BACKPACK_PAGE);
        log.info("waiting for Title element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_details_name")));
        log.info("Title element is visible");
    }
    @Test(priority = 4)
    public void verifyDescriptionElementIsVisible() {
         /*
            verifyTitleElementIsVisible() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(SAUCE_LABS_BACKPACK_PAGE);
        log.info("waiting for Description element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_details_desc")));
        log.info("Description element is visible");
    }
    @Test(priority = 5)
    public void verifyPriceElementIsVisible() {
         /*
            verifyDescriptionElementIsVisible() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(SAUCE_LABS_BACKPACK_PAGE);
        log.info("waiting for Price element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_details_price")));
        log.info("Price element is visible");
    }
    @Test(priority = 5)
    public void clickOnAddToCartButton() {
         /*
            verifyPriceElementIsVisible() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(SAUCE_LABS_BACKPACK_PAGE);
        log.info("waiting for Add To Cart element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-backpack")));
        log.info("Add To Cart element is visible");
        log.info("Click on Add To Cart");
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        log.info("click successful");
    }
    @Test(priority = 6)
    public void clickOnBackToProductsButton() {
         /*
            clickOnAddToCartButton() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(SAUCE_LABS_BACKPACK_PAGE);
        log.info("waiting for Back To Products element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("back-to-products")));
        log.info("Back To Products element is visible");
        log.info("Click on Back To Products");
        driver.findElement(By.id("back-to-products")).click();
        log.info("click successful");
    }
    @Test(priority = 7)
    public void clickOnAddToCartForFleeceJacketFromInventoryPage() {
         /*
            clickOnBackToProductsButton() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(INVENTORY_PAGE);
        log.info("waiting for Add To Cart for Fleece Jacket element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-fleece-jacket")));
        log.info("Add To Cart for Fleece Jacket is visible");
        log.info("Click on Add To Cart");
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        log.info("click successful");
    }
    @Test(priority = 8)
    public void clickOnShoppingCartFromInventoryPageLeadsToShoppingCartPage() {
         /*
            clickOnAddToCartForFleeceJacketFromInventoryPage() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(INVENTORY_PAGE);
        log.info("waiting for Shopping Cart element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.className("shopping_cart_link")));
        log.info("Shopping Cart is visible");
        log.info("Click on Shopping Cart");
        driver.findElement(By.className("shopping_cart_link")).click();
        log.info("click successful");
        waitDriver.until(ExpectedConditions.urlToBe(SHOPPING_CART_PAGE));
        log.info("click leads to {} page", SHOPPING_CART_PAGE);
    }
    @Test(priority = 9)
    public void clickOnCheckOutButtonFromShoppingCartPageLeadsToCheckoutStepOnePage() {
         /*
            clickOnShoppingCartFromInventoryPageLeadsToShoppingCartPage() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(SHOPPING_CART_PAGE);
        log.info("waiting for Check Out element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout")));
        log.info("Check Out is visible");
        log.info("Click on Check Out");
        driver.findElement(By.id("checkout")).click();
        log.info("click successful");
        waitDriver.until(ExpectedConditions.urlToBe(CHECK_OUT_STEP_ONE_PAGE));
        log.info("click leads to {} page", CHECK_OUT_STEP_ONE_PAGE);
    }
    @Test(priority = 10)
    public void enterUsernamePasswordAndZipCodeInCheckOutStepOnePageAndClickOnContinueButton() {
         /*
            clickOnCheckOutButtonFromShoppingCartPageLeadsToCheckoutStepOnePage() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(CHECK_OUT_STEP_ONE_PAGE);
        verifyFirstNameLastNameZipCodeAndContinueElementsAreVisible();
        enterFistNameLastNameAndZipCodeOnCheckOutStepOnePage();
        log.info("click on Continue");
        driver.findElement(By.id("continue")).click();
        log.info("click successful");
        waitDriver.until(ExpectedConditions.urlToBe(CHECK_OUT_STEP_TWO_PAGE));
        log.info("click leads to {} page", CHECK_OUT_STEP_TWO_PAGE);
    }

    @Test(priority = 11)
    public void clickOnFinishButtonFromCheckOutStepTwoPage() {
         /*
            enterUsernamePasswordAndZipCodeInCheckOutStepOnePageAndClickOnContinueButton() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(CHECK_OUT_STEP_TWO_PAGE);
        log.info("waiting for Finish element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        log.info("Finish is visible");
        log.info("click on Finish");
        driver.findElement(By.id("finish")).click();
        log.info("click successful");
        waitDriver.until(ExpectedConditions.urlToBe(CHECKOUT_COMPLETE));
        log.info("click leads to {} page", CHECKOUT_COMPLETE);
    }
    @Test(priority = 12)
    public void verifyThankYouForYourOrderElementIsDisplayed() {
         /*
            clickOnFinishButtonFromCheckOutStepTwoPage() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(CHECKOUT_COMPLETE);
        log.info("waiting for Thank You For Your Order element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.className("complete-header")));
        log.info("Thank You For Your Order is visible");
    }
    @Test(priority = 13)
    public void logoutFromCheckOutCompletePage() {
         /*
            verifyThankYouForYourOrderElementIsDisplayed() TEST NEEDS TO BE EXECUTED BEFORE THIS TEST
       */
        driver.get(CHECKOUT_COMPLETE);
        log.info("waiting for Burger Menu element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn")));
        log.info("Burger Menu is visible");
        log.info("click on Burger Menu");
        driver.findElement(By.id("react-burger-menu-btn")).click();
        log.info("click successful");
        log.info("waiting for Logout element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
        log.info("Logout is visible");
        log.info("click on Logout");
        driver.findElement(By.id("logout_sidebar_link")).click();
        log.info("click successful");
        waitDriver.until(ExpectedConditions.urlToBe(LOGIN_PAGE));
        log.info("click leads to {} page", LOGIN_PAGE);
    }






    private void verifyFirstNameLastNameZipCodeAndContinueElementsAreVisible() {
        log.info("waiting for First Name element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
        log.info("First Name element is visible");
        log.info("waiting for Last Name element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("last-name")));
        log.info("Last Name element is visible");
        log.info("waiting for Zip Code element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("postal-code")));
        log.info("Zip Code element is visible");
        log.info("waiting for Continue element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("continue")));
        log.info("Continue element is visible");

    }
    private void enterFistNameLastNameAndZipCodeOnCheckOutStepOnePage() {
        log.info("Entering Nikola as First Name");
        driver.findElement(By.id("first-name")).sendKeys("Nikola");
        log.info("Entering Rusimovic as Last Name");
        driver.findElement(By.id("last-name")).sendKeys("Rusimovic");
        log.info("Entering 11300 as Postal Code");
        driver.findElement(By.id("postal-code")).sendKeys("11300");
    }


}
