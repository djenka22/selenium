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
import static com.example.seleniumproject.constants.URL.*;
import static org.testng.Assert.*;


@Slf4j
public class TestCase1 {

   public static WebDriver driver;
   public static WebDriverWait waitDriver;

   @BeforeClass
   public static void setDriver() {
       /*
            iz nekog razloga nece da otvori URL kod driver.get() ali otvori browser
            WebDriverManager.chromedriver().setup();
       */

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
       log.info("Login button click leads to {} page", INVENTORY_PAGE);
   }

   @Test(priority = 2)
   public void checksIfHeaderIsPresentAfterSuccessfulLogin() {
       /*
            IT REMEMBERS THE SESSION AFTER LOGIN SO WE CAN GO TO PAGE BELOW STRAIGHT AWAY
       */
       driver.get(INVENTORY_PAGE);
       log.info("waiting for header element to be visible");
       waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.className("header_secondary_container")));
       log.info("header is visible");
       log.info("asserting header is present");
       assertNotNull(driver.findElement(By.className("header_secondary_container")));
       log.info("Header is present");
   }

    @Test(priority = 3)
    public void checksIfShoppingCartIsPresentAfterSuccessfulLogin() {
       /*
            IT REMEMBERS THE SESSION AFTER LOGIN SO WE CAN GO TO PAGE BELOW STRAIGHT AWAY
       */
        driver.get(INVENTORY_PAGE);
        log.info("waiting for shopping-cart element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.className("shopping_cart_link")));
        log.info("shopping-cart is visible");
        log.info("asserting shopping-cart is present");
        assertNotNull(driver.findElement(By.className("shopping_cart_link")));
        log.info("shopping-cart is present");
    }

    @Test(priority = 4)
    public void checksIfTwitterIsPresentAfterSuccessfulLogin() {
       /*
            IT REMEMBERS THE SESSION AFTER LOGIN SO WE CAN GO TO PAGE BELOW STRAIGHT AWAY
       */
        driver.get(INVENTORY_PAGE);
        log.info("waiting for twitter element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Twitter")));
        log.info("twitter is visible");
        log.info("asserting twitter is present");
        assertNotNull(driver.findElement(By.linkText("Twitter")));
        log.info("twitter is present");
    }
    @Test(priority = 5)
    public void checksIfFacebookIsPresentAfterSuccessfulLogin() {
       /*
            IT REMEMBERS THE SESSION AFTER LOGIN SO WE CAN GO TO PAGE BELOW STRAIGHT AWAY
       */
        driver.get(INVENTORY_PAGE);
        log.info("waiting for facebook element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
        log.info("facebook is visible");
        log.info("asserting facebook is present");
        assertNotNull(driver.findElement(By.linkText("Facebook")));
        log.info("facebook is present");
    }
    @Test(priority = 6)
    public void checksIfLinkedInIsPresentAfterSuccessfulLogin() {
       /*
            IT REMEMBERS THE SESSION AFTER LOGIN SO WE CAN GO TO PAGE BELOW STRAIGHT AWAY
       */
        driver.get(INVENTORY_PAGE);
        log.info("waiting for linkedin element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("LinkedIn")));
        log.info("linkedin is visible");
        log.info("asserting linkedin is present");
        assertNotNull(driver.findElement(By.linkText("LinkedIn")));
        log.info("linkedin is present");
    }
    @Test(priority = 7)
    public void checksIfBurgerMenuIsPresentAfterSuccessfulLogin() {
       /*
            IT REMEMBERS THE SESSION AFTER LOGIN SO WE CAN GO TO PAGE BELOW STRAIGHT AWAY
       */
        driver.get(INVENTORY_PAGE);
        log.info("waiting for burger-menu element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn")));
        log.info("burger-menu is visible");
        log.info("asserting burger-menu is present");
        assertNotNull(driver.findElement(By.id("react-burger-menu-btn")));
        log.info("burger-menu is present");
    }

    @Test(priority = 8)
    public void checksIfLogoutIsPresentAfterSuccessfulLogin() {
       /*
            IT REMEMBERS THE SESSION AFTER LOGIN SO WE CAN GO TO PAGE BELOW STRAIGHT AWAY
       */
        driver.get(INVENTORY_PAGE);
        log.info("waiting for burger-menu element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn")));
        log.info("burger-menu is visible");
        log.info("asserting burger-menu is present");
        assertNotNull(driver.findElement(By.id("react-burger-menu-btn")));
        log.info("burger-menu is present");
        log.info("click on burger-menu");
        driver.findElement(By.id("react-burger-menu-btn")).click();

        log.info("waiting for logout element to be visible");
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
        log.info("logout is visible");
        log.info("asserting logout is present");
        assertNotNull(driver.findElement(By.id("logout_sidebar_link")));
        log.info("logout is present");
        log.info("click on logout");
        driver.findElement(By.id("logout_sidebar_link")).click();
        log.info("logout");
    }
}