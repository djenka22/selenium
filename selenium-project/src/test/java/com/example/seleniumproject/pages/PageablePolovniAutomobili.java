package com.example.seleniumproject.pages;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.execute.assertion.InstanceGenerator;
import com.example.seleniumproject.execute.assertion.MyAssert;
import com.example.seleniumproject.methods.MainMethods;
import org.openqa.selenium.*;
import org.testng.Assert;



import static com.example.seleniumproject.methods.MainMethods.*;

public interface PageablePolovniAutomobili {
    default PageablePolovniAutomobili verifyElementIsPresent(By element, WebDriver driver) {
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
    default PageablePolovniAutomobili hoverOverElement(By elementToHoverOver, Assertion assertType, Object toAssert, Class pageToReturn, WebDriver driver) {
        verifyElementIsPresent(elementToHoverOver, driver);
        MainMethods.hoverOverElement(driver, elementToHoverOver);
        MyAssert.handle(assertType, toAssert, driver);
        return (PageablePolovniAutomobili) InstanceGenerator.returnInstance(pageToReturn, driver);
    }

}
