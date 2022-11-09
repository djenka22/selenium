package com.example.seleniumproject.execute.main;

import com.example.seleniumproject.pages.PageFactory;
import com.example.seleniumproject.pages.Pageable;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

@Slf4j
public class SOVerifyElementIsPresent {
    private String pageURL;

    public SOVerifyElementIsPresent(String pageURL) {
        this.pageURL = pageURL;
    }
    public void execute(WebDriver driver, String pageURL, By... element) {
        Pageable page = PageFactory.createPage(pageURL, driver);
        Arrays.stream(element).map(page::verifyElementIsPresent);
        log.info("Elements are present");
    }
}
