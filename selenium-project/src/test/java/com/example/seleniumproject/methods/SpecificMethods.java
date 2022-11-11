package com.example.seleniumproject.methods;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Slf4j
public class SpecificMethods {
    private static final Duration WAIT_DURATION = Duration.ofSeconds(20);
    public static void isLabelSelected(WebDriver driver, By locator) {
        if (!driver.findElement(locator).getAttribute("class").contains("activetab"))
            throw new RuntimeException("element is not selected");
        log.info("{} label is selected", locator);
    }
}
