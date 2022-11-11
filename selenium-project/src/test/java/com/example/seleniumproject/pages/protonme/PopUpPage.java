package com.example.seleniumproject.pages.protonme;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.execute.assertion.InstanceGenerator;
import com.example.seleniumproject.execute.assertion.MyAssert;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static com.example.seleniumproject.constants.protonme.URLProtonMe.MESSAGE_PAGE;
import static com.example.seleniumproject.methods.MainMethods.click;

@Slf4j
public class PopUpPage implements PageablePolovniAutomobili {
    private final int TAB_INDEX = 2;
    WebDriver driver;
    private static PopUpPage instance;
    private PopUpPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        if(!driver.getCurrentUrl().equals(MESSAGE_PAGE)) {
            driver.get(MESSAGE_PAGE);
        }
    }
    public static PopUpPage getInstance(WebDriver driver) {
        if (instance == null) {
            log.info("creating new instance of PopUpPage");
            instance = new PopUpPage(driver);
        }
        return instance;
    }

    @Override
    public PageablePolovniAutomobili handleClick(By elementToClick, Assertion assertType, Object toAssert, Class pageToReturn, WebDriver driver) {
        verifyElementIsPresent(elementToClick, driver);
        click(elementToClick, driver);
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(TAB_INDEX));
        MyAssert.handle(assertType, toAssert, driver);
        return (PageablePolovniAutomobili) InstanceGenerator.returnInstance(pageToReturn, driver);
    }
}
