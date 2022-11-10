package com.example.seleniumproject.pages.protonme;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.execute.assertion.InstanceGenerator;
import com.example.seleniumproject.execute.assertion.MyAssert;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.protonme.URLProtonMe.INBOX_PAGE;
import static com.example.seleniumproject.methods.MainMethods.*;

@Slf4j
public class InboxPage implements PageablePolovniAutomobili {
    WebDriver driver;
    private static InboxPage instance;
    private InboxPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        if(!driver.getCurrentUrl().equals(INBOX_PAGE)) {
            driver.get(INBOX_PAGE);
        }
    }
    public static InboxPage getInstance(WebDriver driver) {
        if (instance == null) {
            log.info("creating new instance of InboxPage");
            instance = new InboxPage(driver);
        }
        return instance;
    }

    @Override
    public PageablePolovniAutomobili verifyElementIsPresent(By element) {
        log.info("waiting for {} element to be visible", element);
        waitForElementToBeVisible(driver, element);
        return this;
    }
    @Override
    public PageablePolovniAutomobili justClick(By elementToClick, Assertion assertType, Object toAssert, Class pageToReturn) {
        verifyElementIsPresent(elementToClick);
        click(elementToClick, driver);
        MyAssert.handle(assertType, toAssert, driver);
        return (PageablePolovniAutomobili) InstanceGenerator.returnInstance(pageToReturn, driver);
    }

    @Override
    public PageablePolovniAutomobili sendKeyToElement(String key, By element) {
        return null;
    }

    @Override
    public PageablePolovniAutomobili clickOnPostaviOglasButton() {
        return null;
    }

    @Override
    public PageablePolovniAutomobili clickOnRegistrujSe() {
        return null;
    }

    @Override
    public PageablePolovniAutomobili clickOnCheckBox(By locator) {
        return null;
    }

    @Override
    public PageablePolovniAutomobili verifyElementIsSelected(By element) {
        return null;
    }

    @Override
    public PageablePolovniAutomobili clickOnLoginButton(By locator) {
        return null;
    }


}
