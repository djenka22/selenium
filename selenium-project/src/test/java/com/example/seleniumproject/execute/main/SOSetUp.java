package com.example.seleniumproject.execute.main;

import com.example.seleniumproject.methods.MainMethods;
import org.openqa.selenium.WebDriver;

public class SOSetUp {
    private WebDriver driver;
    public SOSetUp() {}

    public void execute(String browser) {
        this.driver = MainMethods.setUpDriver(browser);
    }
    public WebDriver getDriver() {
        return this.driver;
    }



}
