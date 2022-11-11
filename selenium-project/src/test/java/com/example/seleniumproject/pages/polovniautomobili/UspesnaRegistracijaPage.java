package com.example.seleniumproject.pages.polovniautomobili;

import com.example.seleniumproject.constants.enumconst.Assertion;
import com.example.seleniumproject.constants.polovniautomobili.URLPolovniAutomobili;
import com.example.seleniumproject.pages.PageablePolovniAutomobili;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.example.seleniumproject.methods.MainMethods.*;

@Slf4j
public class UspesnaRegistracijaPage implements PageablePolovniAutomobili {
    WebDriver driver;
    private static UspesnaRegistracijaPage instance;


    private UspesnaRegistracijaPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.get(URLPolovniAutomobili.USPESNA_REGISTRACIJA_PAGE);
    }
    public static UspesnaRegistracijaPage getInstance(WebDriver driver) {
        if (instance == null) {
            log.info("creating new instance of HomePage");
            instance = new UspesnaRegistracijaPage(driver);
        }
        return instance;
    }

}
