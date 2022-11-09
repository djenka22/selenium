package com.example.seleniumproject.pages;

import org.openqa.selenium.By;

public interface Pageable {
    public abstract Pageable verifyElementIsPresent(By element);
    public abstract Pageable sendKeyToElement(String key, By element);
}
