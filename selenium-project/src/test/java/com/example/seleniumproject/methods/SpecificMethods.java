package com.example.seleniumproject.methods;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@Slf4j
public class SpecificMethods {
    public static void isLabelSelected(WebDriver driver, By locator) {
        if (!driver.findElement(locator).getAttribute("class").contains("activetab"))
            throw new RuntimeException("element is not selected");
        log.info("{} label is selected", locator);
    }
}
