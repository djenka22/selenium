package com.example.seleniumproject.service;

import com.example.seleniumproject.execute.main.SOSetUp;
import com.example.seleniumproject.execute.thirdcase.SOCreateUserAccountOnPolovniAutomobili;
import com.example.seleniumproject.execute.thirdcase.SORegisterOnPolovniAutomobili;
import com.example.seleniumproject.execute.thirdcase.SOSignInOnPolovniAutomobili;
import com.example.seleniumproject.execute.thirdcase.SOVerifyRegistrationOnProtonMe;
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

    public void verifyRegistrationOnProtonMe() {
        SOVerifyRegistrationOnProtonMe soVerifyRegistration = new SOVerifyRegistrationOnProtonMe();
        soVerifyRegistration.execute(driver);
    }

    public void createUserAccountOnPolovniAutomobili() {
        SOCreateUserAccountOnPolovniAutomobili soCreate = new SOCreateUserAccountOnPolovniAutomobili();
        soCreate.execute(driver);
    }

    public void signInOnPolovniAutomobili() {
        SOSignInOnPolovniAutomobili soSignIn = new SOSignInOnPolovniAutomobili();
        soSignIn.execute(driver);
    }
}
