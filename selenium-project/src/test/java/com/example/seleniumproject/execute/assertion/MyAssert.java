package com.example.seleniumproject.execute.assertion;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.constants.polovniautomobili.URLPolovniAutomobili;
import com.example.seleniumproject.constants.polovniautomobili.URLPolovniAutomobili.*;
import com.example.seleniumproject.methods.MainMethods;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import com.example.seleniumproject.pages.polovniautomobili.RegistracijaPage;
import com.example.seleniumproject.pages.polovniautomobili.RegistracijaUspesnaPage;
import com.example.seleniumproject.pages.polovniautomobili.UspesnaRegistracijaPage;
import com.example.seleniumproject.pages.protonme.LoginPage;
import com.example.seleniumproject.pages.protonme.HomePage;
import com.example.seleniumproject.pages.protonme.InboxPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.enumconst.Assertion.ASSERT_ELEMENT_VISIBLE;
import static com.example.seleniumproject.constants.enumconst.Assertion.ASSERT_URL;


@Slf4j
public class MyAssert {
    public static void handle(Assertion type, Object toAssert, WebDriver driver) {

        if(type.equals(ASSERT_URL)) {
            assertUrl(driver, toAssert);
        }
        if(type.equals(ASSERT_ELEMENT_VISIBLE)) {
            assertElementVisible(driver, toAssert);
        }
    }

    private static void assertElementVisible(WebDriver driver, Object toAssert) {
        if (!(toAssert instanceof By)) {
            throw new RuntimeException("error");
        }
        MainMethods.waitForElementToBeVisible(driver, (By)toAssert);
    }

    private static void assertUrl(WebDriver driver, Object toAssert) {
        if (!(toAssert instanceof String)) {
            throw new RuntimeException("error");
        }
        MainMethods.isCurrentUrl(driver, (String)toAssert);
    }

}
