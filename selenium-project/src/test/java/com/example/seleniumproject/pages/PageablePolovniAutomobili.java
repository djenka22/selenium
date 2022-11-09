package com.example.seleniumproject.pages;

import com.example.seleniumproject.pages.polovniautomobili.LoginPage;
import com.example.seleniumproject.pages.polovniautomobili.RegistracijaPage;
import org.openqa.selenium.By;

public interface PageablePolovniAutomobili {
    public abstract PageablePolovniAutomobili verifyElementIsPresent(By element);
    public abstract PageablePolovniAutomobili sendKeyToElement(String key, By element);
    public abstract PageablePolovniAutomobili clickOnPostaviOglasButton();
    public abstract PageablePolovniAutomobili clickOnRegistrujSe();
    public abstract PageablePolovniAutomobili clickOnCheckBox(By locator);
    public abstract PageablePolovniAutomobili verifyElementIsSelected(By element);
}
