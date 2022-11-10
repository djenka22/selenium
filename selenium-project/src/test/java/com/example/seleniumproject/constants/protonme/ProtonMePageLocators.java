package com.example.seleniumproject.constants.protonme;

import org.openqa.selenium.By;

public interface ProtonMePageLocators {
    public static final By SIGH_IN_BUTTON_LOCATOR = By.xpath("//a[@class='btn inline-block rounded-full font-bold btn-small btn-outlined-purple text-center !leading-4 lg:!leading-6']");
    public static final By EMAIL_INPUT_LOCATOR = By.xpath("//input[@id='username']");
    public static final By PASSWORD_INPUT_LOCATOR = By.xpath("//input[@id='password']");
    public static final By SIGH_IN_BUTTON_LOCATOR_SECOND = By.xpath("//button[normalize-space()='Sign in']");
    public static final By INBOX_MESSAGE_LOCATOR = By.xpath("//span[@title='noreply@polovniautomobili.com']");
    public static final By INBOX_MESSAGE_ASSERTION_LOCATOR = By.xpath("//span[@class='inline-flex flex-item-fluid flex-nowrap relative message-recipient-item-label-address']//span[@class='message-recipient-item-label'][normalize-space()='PolovniAutomobili']");
    public static final By TEST =  By.xpath("//input[@placeholder='Search messages']");
    public static final By AKTIVACIONI_LINK = By.xpath("//a[contains(text(),'https://www.polovniautomobili.com/aktivacija-nalog')]");
    public static final By POP_UP_LOCATOR = By.xpath("//button[normalize-space()='Confirm']");
    public static final By POP_UP_SECOND_LOCATOR = By.xpath("//button[normalize-space()='U redu']");
    public static final By POTVRDI_REGISTRACIJU_LOCATOR = By.xpath("//input[@id='first_name']");
    public static final By NAME_LOCATOR = By.xpath("//button[normalize-space()='U redu']");
    public static final By SURNAME_LOCATOR = By.xpath("//input[@id='last_name']");
    public static final By ADDRESS_LOCATOR = By.xpath("//input[@id='address']");
    public static final By CITY_LOCATOR = By.xpath("//input[@id='city']");
    public static final By ZIP_CODE_LOCATOR = By.xpath("//input[@id='zip_code']");
    public static final By REGION_LOCATOR = By.xpath("//label[contains(text(),'Beograd (uži)')]");
    public static final By REGION_CONFIRM_LOCATOR = By.xpath("//button[normalize-space()='U redu']");
    public static final By STATE_LOCATOR = By.xpath("//p[@title=' Srbija']");
    public static final By PHONE_LOCATOR = By.xpath("//input[@id='cellphone']");
    public static final By SAVE_BUTTON_LOCATOR = By.xpath("//button[@id='submit']");
}
