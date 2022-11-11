package com.example.seleniumproject.pages.protonme;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.constants.protonme.ProtonMePageLocators;
import com.example.seleniumproject.execute.assertion.InstanceGenerator;
import com.example.seleniumproject.execute.assertion.MyAssert;
import com.example.seleniumproject.methods.MainMethods;
import com.example.seleniumproject.methods.SpecificMethods;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.protonme.ProtonMePageLocators.IFRAME_AKTIVACIONI_LINK_LOCATOR;
import static com.example.seleniumproject.constants.protonme.URLProtonMe.INBOX_PAGE;
import static com.example.seleniumproject.constants.protonme.URLProtonMe.MESSAGE_PAGE;

@Slf4j
public class MessagePage implements PageablePolovniAutomobili {
    WebDriver driver;
    private static MessagePage instance;
    private MessagePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        if(!driver.getCurrentUrl().equals(MESSAGE_PAGE)) {
            driver.get(MESSAGE_PAGE);
        }
    }
    public static MessagePage getInstance(WebDriver driver) {
        if (instance == null) {
            log.info("creating new instance of MessagePage");
            instance = new MessagePage(driver);
        }
        return instance;
    }

    @Override
    public PageablePolovniAutomobili handleClick(By elementToClick, Assertion assertType, Object toAssert, Class pageToReturn, WebDriver driver) {
        MainMethods.switchToIframe(driver, IFRAME_AKTIVACIONI_LINK_LOCATOR);
        MainMethods.waitForElementToBeVisible(driver, elementToClick);
        MainMethods.click(elementToClick, driver);
        MainMethods.switchToDefaultContent(driver);
        MyAssert.handle(Assertion.ASSERT_ELEMENT_VISIBLE, toAssert, driver);
        return (PageablePolovniAutomobili) InstanceGenerator.returnInstance(pageToReturn, driver);
    }

}
