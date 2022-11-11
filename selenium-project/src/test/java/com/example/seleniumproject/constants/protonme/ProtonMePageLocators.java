package com.example.seleniumproject.constants.protonme;

import org.openqa.selenium.By;

public interface ProtonMePageLocators {
    By SIGH_IN_BUTTON_LOCATOR = By.xpath("//a[@class='btn inline-block rounded-full font-bold btn-small btn-outlined-purple text-center !leading-4 lg:!leading-6']");
    By EMAIL_INPUT_LOCATOR = By.xpath("//input[@id='username']");
    By PASSWORD_INPUT_LOCATOR = By.xpath("//input[@id='password']");
    By SIGH_IN_BUTTON_LOCATOR_SECOND = By.xpath("//button[normalize-space()='Sign in']");
    By INBOX_MESSAGE_LOCATOR = By.xpath("//span[@title='noreply@polovniautomobili.com']");
    By INBOX_MESSAGE_ASSERTION_LOCATOR = By.xpath("//div[@class='message-iframe p1']");
    By TEST = By.xpath("//input[@placeholder='Search messages']");
    By IFRAME_AKTIVACIONI_LINK_LOCATOR = By.xpath("//iframe[@title='Email content']");
    By AKTIVACIONI_LINK_LOCATOR = By.xpath("//a[contains(text(),'https://www.polovniautomobili.com/aktivacija-nalog')]");
    By POP_UP_LOCATOR = By.xpath("//button[normalize-space()='Confirm']");
    By POTVRDI_REGISTRACIJU_LOCATOR = By.xpath("//button[normalize-space()='POTVRDI']");
    By POP_UP_SECOND_LOCATOR = By.xpath("//button[normalize-space()='U redu']");

}
