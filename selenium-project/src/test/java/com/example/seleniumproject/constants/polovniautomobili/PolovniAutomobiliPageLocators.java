package com.example.seleniumproject.constants.polovniautomobili;

import org.openqa.selenium.By;

import static com.example.seleniumproject.constants.polovniautomobili.StandardUser.EMAIL_VERIFY;

public interface PolovniAutomobiliPageLocators {
    By POSTAVI_OGLAS_BUTTON_LOCATOR = By.xpath("//a[@data-label='Postavi oglas']");
    By REGISTRUJ_SE_BUTTON_FIRST_LOCATOR = By.xpath("//a[normalize-space()='Registruj se']");
    By EMAIL_ADRESA_INPUT_LOCATOR = By.xpath("//input[@id='email']");
    By LOZINKA_FIRST_INPUT_LOCATOR = By.xpath("//input[@id='password_first']");
    By LOZINKA_SECOND_INPUT_LOCATOR = By.xpath("//input[@id='password_second']");
    By RADIO_BUTTON_FIRST_LOCATOR = By.xpath("//input[@id='tos']");
    By RADIO_BUTTON_SECOND_LOCATOR = By.xpath("//input[@id='easySaleConsent']");
    By RADIO_BUTTON_THIRD_LOCATOR = By.xpath("//input[@id='easyBuyConsent']");
    By EMAIL_POTVRDA_LOCATOR = By.xpath("//label[normalize-space()='Emaila']");
    By REGISTRUJ_SE_BUTTON_SECOND_LOCATOR = By.xpath("//button[normalize-space()='Registruj se']");
    By HVALA_NA_REGISTRACIJI_LOCATOR = By.xpath("//p[normalize-space()='Hvala na registraciji!']");
    By NAME_LOCATOR = By.xpath("//input[@id='first_name']");
    By SURNAME_LOCATOR = By.xpath("//input[@id='last_name']");
    By ADDRESS_LOCATOR = By.xpath("//input[@id='address']");
    By CITY_LOCATOR = By.xpath("//input[@id='city']");
    By ZIP_CODE_LOCATOR = By.xpath("//input[@id='zip_code']");
    By REGION_CONFIRM_LOCATOR = By.xpath("//span[normalize-space()='Podunavski']");
    By REGION_LOCATOR = By.xpath("//div[@class='uk-width-medium-1-2 uk-width-1-1']//a[1]");
    By STATE_LOCATOR = By.xpath("//p[@title=' Srbija']");
    By PHONE_LOCATOR = By.xpath("//input[@id='cellphone']");
    By SAVE_BUTTON_LOCATOR = By.xpath("//button[@id='submit']");
    By SUCCESS_ALERT = By.xpath("//div[@class='uk-alert uk-alert-success']");
    By MY_PROFILE_LOCATOR = By.xpath("//div[@class='uk-float-left']");
    By ODJAVI_SE_LOCATOR = By.xpath("//ul[@class='uk-nav uk-nav-dropdown']//a[@title='Odjavite se iz sistema'][normalize-space()='Odjavi se']");
    By PRIJAVI_SE_LOCATOR = By.xpath("//a[@data-label='MP - Prijavi se']");
    By PRIJAVI_SE_AFTER_HOVER_LOCATOR = By.xpath("//a[@title='Prijavi se']");
    By UNESI_EMAIL_LOCATOR = By.xpath("//input[@id='username_header']");
    By DALJE_BUTTON_LOCATOR = By.xpath("//button[@id='next-step']");
    By UNESI_LOZINKU_LOCATOR = By.xpath("//input[@id='password_header']");
    By PRIJAVI_SE_BUTTON_LOCATOR = By.xpath("//button[normalize-space()='Prijavi se']");
    By VERIFY_EMAIL_IS_CORRECT_AFTER_SIGN_IN = By.xpath("//span[contains(@class, 'ym-hide-content') and text()=" + "'" + EMAIL_VERIFY + "']");
    //span[contains(@class, 'ym-hide-content') and text()=" + "'" + EMAIL_VERIFY + "']"
}
