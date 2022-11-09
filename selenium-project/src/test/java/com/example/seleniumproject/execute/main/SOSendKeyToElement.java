package com.example.seleniumproject.execute.main;

import com.example.seleniumproject.pages.PageFactory;
import com.example.seleniumproject.pages.Pageable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SOSendKeyToElement {
    private String pageURL;

    public SOSendKeyToElement(String pageURL) {
        this.pageURL = pageURL;
    }
    public void execute(WebDriver driver, By element, String key) {
        Pageable page = PageFactory.createPage(pageURL, driver);
        page.sendKeyToElement(key, element);
    }
}
