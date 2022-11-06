package com.example.seleniumproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

// page_url = https://www.saucedemo.com/
@Slf4j
public class FirstTest {

   public WebDriver driver;
   public final String URL = "https://www.saucedemo.com/";

   // @FindBy(className = "header_secondary_container")
    //public WebElement header;


   
   @BeforeAll
   public static void setDriver() {
       /*
            iz nekog razloga ne radi WebDriverManager
       */
       //WebDriverManager.chromedriver().setup();
       System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

   }

   @BeforeEach
   public void setup() {
       driver = new ChromeDriver();
   }

   @AfterEach
   public void quit() {
       driver.quit();
   }

   @Test
   public void openURL() {
       log.info("Inside openURL method");
       log.info("Opening url");
       driver.get(URL);
       log.info("URL opened successfully");
   }

   @Test
   public void loginWithUsernameAndPassword() throws InterruptedException {
       log.info("Inside loginWithUsernameAndPassword method");
       log.info("web page opening");
       driver.get(URL);
       log.info("getting elements");
       WebElement userNameInput = driver.findElement(By.name("user-name"));
       WebElement passwordInput = driver.findElement(By.id("password"));
       WebElement loginButton = driver.findElement(By.id("login-button"));

       /*
            GIVEN
       */
       log.info("sending keys to username field");
       userNameInput.sendKeys("standard_user");
       log.info("sending keys to password field");
       passwordInput.sendKeys("secret_sauce");
       log.info("Username: " + userNameInput.getAttribute("value"));
       log.info("Password: " + passwordInput.getAttribute("value"));

       /*
            WHEN
       */
       loginButton.click();
       log.info("Login successful");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    // Thread.sleep(2000);

       /*
            THEN
       */
       Assertions.assertThat(driver.getCurrentUrl()).isEqualTo("https://www.saucedemo.com/inventory.html");
       log.info("Login button click leads to https://www.saucedemo.com/inventory.html page");




   }

   @Test
   public void checksIfWebElementsArePresentAfterSuccessfulLogin() throws InterruptedException {
       log.info("Inside checksIfWebElementsArePresentAfterSuccessfulLogin method");
       try {
           loginWithUsernameAndPassword();
       } catch (InterruptedException e) {
           log.error("Could not execute method loginWithUsernameAndPassword()");
           throw new RuntimeException(e);
       }
       log.info("getting header element");
       WebElement header = driver.findElement(By.className("header_secondary_container"));
       assertThat(header.isDisplayed()).isTrue();
       log.info("Header is present");

       log.info("getting shopping-cart element");
       WebElement shoppingCart = driver.findElement(By.className("shopping_cart_link"));
       assertThat(shoppingCart.isDisplayed()).isTrue();
       log.info("Shopping cart is present");

       log.info("getting burger-menu element");
       WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
       assertThat(burgerMenu.isDisplayed()).isTrue();
       log.info("Burger menu is present");

       log.info("getting twitter element");
       WebElement twitterIcon = driver.findElement(By.linkText("Twitter"));
       assertThat(twitterIcon.isDisplayed()).isTrue();
       log.info("Twitter is present");

       log.info("getting facebook element");
       WebElement facebookIcon = driver.findElement(By.linkText("Facebook"));
       assertThat(facebookIcon.isDisplayed()).isTrue();
       log.info("Facebook is present");

       log.info("getting linkedin element");
       WebElement linkedinIcon = driver.findElement(By.linkText("LinkedIn"));
       assertThat(linkedinIcon.isDisplayed()).isTrue();
       log.info("Linkedin is present");

       log.info("getting logout element");
       log.info("Opening burger menu");
       burgerMenu.click();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
       assertThat(logout.isDisplayed()).isTrue();
       log.info("Logout is present");
   }
}