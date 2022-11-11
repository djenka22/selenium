package com.example.seleniumproject.methods;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.example.seleniumproject.constants.MyBrowser.CHROME;
@Slf4j
public class MainMethods {
    private static final Duration WAIT_DURATION = Duration.ofSeconds(20);
    public static WebDriver setUpDriver(String browser) {
        if (browser.equals(CHROME)) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("start-maximized");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-extensions");
            options.addArguments("--enable-automation");
            System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
            log.info("creating driver");
            return new ChromeDriver(options);

        }
        throw new RuntimeException("Driver not instantiated");
    }
    public static void waitForElementToBeVisible(WebDriver driver, By locator) {
        log.info("waiting for {} element to be visible", locator);
        WebDriverWait waitDriver = new WebDriverWait(driver, WAIT_DURATION);
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(locator));
        log.info("element {} is visible", locator);
    }
    public static void waitForElementToBeClickable(WebDriver driver, By locator) {
        log.info("waiting for {} element to be clickable", locator);
        WebDriverWait waitDriver = new WebDriverWait(driver, WAIT_DURATION);
        waitDriver.until(ExpectedConditions.elementToBeClickable(locator));
        log.info("element {} is clickable", locator);
    }
    public static void sendKeyToElementMethod(String key, By locator, WebDriver driver) {
        driver.findElement(locator).sendKeys(key);
        log.info("Key {} has been sent to {} locator", key, locator);

    }
    public static void click(By locator, WebDriver driver) {
        driver.findElement(locator).click();
        log.info("click on {} element", locator);
    }
    public static void isCurrentUrl(WebDriver driver, String URL) {
        WebDriverWait waitDriver = new WebDriverWait(driver, WAIT_DURATION);
        waitDriver.until(ExpectedConditions.urlToBe(URL));
        log.info("{} is current URL", URL);
    }
    public static void isElementSelected(WebDriver driver, By locator) {
        WebDriverWait waitDriver = new WebDriverWait(driver, WAIT_DURATION);
        waitDriver.until(ExpectedConditions.elementToBeSelected(locator));
        log.info("{} element is selected", locator);
    }

    public static void switchTab(WebDriver driver, String URL) {
        driver.switchTo().newWindow(WindowType.TAB).get(URL);
    }
    public static void switchToIframe(WebDriver driver, By locator) {
        log.info("switching to iframe {}", locator);
        driver.switchTo().frame(driver.findElement(locator));
    }
    public static void switchToDefaultContent(WebDriver driver) {
        log.info("switching to default content");
        driver.switchTo().defaultContent();
    }
    public static void hoverOverElement(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        Actions hover = new Actions(driver);
        hover.moveToElement(element).build().perform();
    }


}
