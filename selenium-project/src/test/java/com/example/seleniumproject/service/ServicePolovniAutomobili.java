package com.example.seleniumproject.service;

import com.example.seleniumproject.execute.main.SOSetUp;
import com.example.seleniumproject.execute.thirdcase.SORegisterOnPolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
public class ServicePolovniAutomobili {
    private WebDriver driver;

    public void setUp(String browser) {
        SOSetUp setUp = new SOSetUp();
        setUp.execute(browser);
        driver = setUp.getDriver();
    }
    public void tearDown() {
        driver.quit();
    }

    public void registerAccountOnPolovniAutomobili() {
        SORegisterOnPolovniAutomobili soRegister = new SORegisterOnPolovniAutomobili();
        soRegister.execute(driver);
    }
}