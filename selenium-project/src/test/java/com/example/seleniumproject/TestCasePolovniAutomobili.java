package com.example.seleniumproject;

import com.example.seleniumproject.service.Service;
import com.example.seleniumproject.service.ServicePolovniAutomobili;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.example.seleniumproject.constants.MyBrowser.CHROME;

public class TestCasePolovniAutomobili {
    public static ServicePolovniAutomobili service;
    public static String browser = CHROME;

    @BeforeClass
    public static void setDriver() {
        service = new ServicePolovniAutomobili();
        service.setUp(browser);
    }
    @AfterClass
    public void tearDown() {
        service.tearDown();
    }

    @Test(priority = 1)
    public void registerAccountOnPolovniAutomobili() {
        service.registerAccountOnPolovniAutomobili();
    }
    @Test(priority = 2)
    public void verifyRegistrationOnProtonMe() {
        service.verifyRegistrationOnProtonMe();
    }
    @Test(priority = 3)
    public void createUserAccountOnPolovniAutomobili() {
        service.createUserAccountOnPolovniAutomobili();
    }
    @Test(priority = 4)
    public void signInOnPolovniAutomobili() {
        service.signInOnPolovniAutomobili();
    }
}
