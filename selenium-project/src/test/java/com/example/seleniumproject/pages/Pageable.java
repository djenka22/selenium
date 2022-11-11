package com.example.seleniumproject.pages;

import org.openqa.selenium.By;

public interface Pageable {
    Pageable verifyElementIsPresent(By element);
    Pageable sendKeyToElement(String key, By element);
}
