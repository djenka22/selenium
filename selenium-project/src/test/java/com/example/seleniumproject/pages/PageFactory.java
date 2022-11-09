package com.example.seleniumproject.pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

import static com.example.seleniumproject.constants.url.URLFirstAndSecondCase.INVENTORY_PAGE;
import static com.example.seleniumproject.constants.url.URLFirstAndSecondCase.LOGIN_PAGE;
@Slf4j
public class PageFactory {
    public static Pageable createPage(String identity, WebDriver driver) {
        if(identity.equals(LOGIN_PAGE)) {
            log.info("creating new LoginPage");
            return LoginPage.getInstance(driver);
        }
        if(identity.equals(INVENTORY_PAGE)) {
            log.info("creating new InventoryPage");
            return InventoryPage.getInstance(driver);
        }
        throw new RuntimeException("Unable to create page");
    }


}
