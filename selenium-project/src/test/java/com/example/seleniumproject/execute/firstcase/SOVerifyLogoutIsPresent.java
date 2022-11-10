package com.example.seleniumproject.execute.firstcase;


import com.example.seleniumproject.pages.saucedemo.InventoryPage;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.firstandseconcase.InventoryPageLocators.BURGER_MENU_LOCATOR;

public class SOVerifyLogoutIsPresent {
    private String pageURL;

    public SOVerifyLogoutIsPresent(String pageURL) {
        this.pageURL = pageURL;
    }
    public void execute(WebDriver driver) {
        InventoryPage page = InventoryPage.getInstance(driver);
        page
                .verifyElementIsPresent(BURGER_MENU_LOCATOR);

        page
                .clickOnBurgerMenu()
                .clickOnLogout();
    }
}
