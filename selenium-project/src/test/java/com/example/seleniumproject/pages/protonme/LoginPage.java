package com.example.seleniumproject.pages.protonme;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.execute.assertion.InstanceGenerator;
import com.example.seleniumproject.execute.assertion.MyAssert;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.example.seleniumproject.constants.protonme.URLProtonMe.INBOX_PAGE;
import static com.example.seleniumproject.constants.protonme.URLProtonMe.LOGIN_PAGE;
import static com.example.seleniumproject.methods.MainMethods.*;

@Slf4j
public class LoginPage implements PageablePolovniAutomobili {
    WebDriver driver;
    private static LoginPage instance;


    private LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        if(!driver.getCurrentUrl().equals(LOGIN_PAGE)) {
            driver.get(LOGIN_PAGE);
        }
    }
    public static LoginPage getInstance(WebDriver driver) {
        if (instance == null) {
            log.info("creating new instance of LoginPage");
            instance = new LoginPage(driver);
        }
        return instance;
    }

}
