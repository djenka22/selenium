package com.example.seleniumproject.methods;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.example.seleniumproject.constants.MyBrowser.CHROME;
@Slf4j
public class MainMethods {
    private static final long WAIT_DURATION = 10;
    public static WebDriver setUpDriver(String browser) {
        if (browser.equals(CHROME)) {
            System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
            return new ChromeDriver();
        }
        throw new RuntimeException("Driver not instantiated");
    }
    public static void waitForElementToBeVisible(WebDriver driver, By locator) {
        log.info("waiting for {} element to be visible", locator);
        WebDriverWait waitDriver = new WebDriverWait(driver, Duration.ofSeconds(WAIT_DURATION));
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(locator));
        log.info("element {} is visible", locator);
    }
    public static void sendKeyToElementMethod(String key, By locator, WebDriver driver) {
        driver.findElement(locator).sendKeys(key);
        log.info("Key {} has been sent to {} locator", key, locator);

    }
    public static void click(By locator, WebDriver driver) {
        driver.findElement(locator).click();
        log.info("click on {} element", locator);
    }
    public static boolean isCurrentUrl(WebDriver driver, String URL) {
        return driver.getCurrentUrl().equals(URL);
    }
    public static boolean isSelected(WebDriver driver, By locator) {
        return driver.findElement(locator).isSelected();
    }

}
