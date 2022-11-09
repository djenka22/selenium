package com.example.seleniumproject.constants.polovniautomobili;

import org.openqa.selenium.By;

public interface PolovniAutomobiliPageLocators {
    public static final By POSTAVI_OGLAS_BUTTON_LOCATOR = By.xpath("//a[@data-label='Postavi oglas']");
    public static final By REGISTRUJ_SE_BUTTON_FIRST_LOCATOR = By.xpath("//a[normalize-space()='Registruj se']");
    public static final By EMAIL_ADRESA_INPUT_LOCATOR = By.xpath("//input[@id='email']");
    public static final By LOZINKA_FIRST_INPUT_LOCATOR = By.xpath("//input[@id='password_first']");
    public static final By LOZINKA_SECOND_INPUT_LOCATOR = By.xpath("//input[@id='password_second']");
    public static final By RADIO_BUTTON_FIRST_LOCATOR = By.xpath("//input[@id='tos']");
    public static final By RADIO_BUTTON_SECOND_LOCATOR = By.xpath("//input[@id='easySaleConsent']");
    public static final By RADIO_BUTTON_THIRD_LOCATOR = By.xpath("//input[@id='easyBuyConsent']");
    public static final By EMAIL_POTVRDA_LOCATOR = By.xpath("//label[normalize-space()='Emaila']");
    public static final By REGISTRUJ_SE_BUTTON_SECOND_LOCATOR = By.xpath("//button[normalize-space()='Registruj se']");
    public static final By HVALA_NA_REGISTRACIJI_LOCATOR = By.xpath("//p[normalize-space()='Hvala na registraciji!']");
}
