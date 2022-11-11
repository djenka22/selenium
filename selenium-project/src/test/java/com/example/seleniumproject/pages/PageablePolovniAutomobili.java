package com.example.seleniumproject.pages;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.execute.assertion.InstanceGenerator;
import com.example.seleniumproject.execute.assertion.MyAssert;
import com.example.seleniumproject.pages.polovniautomobili.LoginPage;
import com.example.seleniumproject.pages.polovniautomobili.RegistracijaPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;


import static com.example.seleniumproject.methods.MainMethods.*;

public interface PageablePolovniAutomobili {
    default PageablePolovniAutomobili verifyElementIsPresent(By element, WebDriver driver) {
        //log.info("waiting for {} element to be visible", element);
        waitForElementToBeVisible(driver, element);
        return this;
    }
    default PageablePolovniAutomobili sendKeyToElement(String key, By element, WebDriver driver) {
        verifyElementIsPresent(element, driver);
        sendKeyToElementMethod(key, element, driver);
        Assert.assertEquals(driver.findElement(element).getAttribute("value"), key);
        return this;
    }
    default PageablePolovniAutomobili verifyElementIsSelected(By element, WebDriver driver) {
        verifyElementIsPresent(element, driver);
        isElementSelected(driver, element);
        return this;
    }
    default PageablePolovniAutomobili handleClick(By elementToClick, Assertion assertType, Object toAssert, Class pageToReturn, WebDriver driver) {
        waitForElementToBeClickable(driver, elementToClick);
        click(elementToClick, driver);
        MyAssert.handle(assertType, toAssert, driver);
        return (PageablePolovniAutomobili) InstanceGenerator.returnInstance(pageToReturn, driver);
    }

}
