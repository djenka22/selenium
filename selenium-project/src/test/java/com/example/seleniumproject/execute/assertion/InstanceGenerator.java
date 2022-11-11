package com.example.seleniumproject.execute.assertion;


import org.openqa.selenium.WebDriver;

import java.lang.reflect.Method;

public class InstanceGenerator {
    public static String METHOD_NAME = "getInstance";
    public static Object returnInstance(Class pageToReturn, WebDriver driver) {
        try {
            Method instance = pageToReturn.getMethod(METHOD_NAME, WebDriver.class);
            return instance.invoke(null, driver);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

   /*
        public Object returnInstance(Class pageToReturn, T param) {
        try {
            Method instance = pageToReturn.getMethod(METHOD_NAME, param.getClass());
            return instance.invoke(null, param);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    */

}
