package com.example.seleniumproject.pages.polovniautomobili;

import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import com.example.seleniumproject.pages.protonme.InboxPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.protonme.URLProtonMe.INBOX_PAGE;
import static com.example.seleniumproject.constants.protonme.URLProtonMe.KORISNICKI_PROFIL;

@Slf4j
public class KorisnickiProfilPage implements PageablePolovniAutomobili {
    WebDriver driver;
    private static KorisnickiProfilPage instance;
    private KorisnickiProfilPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        if(!driver.getCurrentUrl().equals(KORISNICKI_PROFIL)) {
            driver.get(KORISNICKI_PROFIL);
        }
    }
    public static KorisnickiProfilPage getInstance(WebDriver driver) {
        if (instance == null) {
            log.info("creating new instance of KorisnickiProfilPage");
            instance = new KorisnickiProfilPage(driver);
        }
        return instance;
    }
}
