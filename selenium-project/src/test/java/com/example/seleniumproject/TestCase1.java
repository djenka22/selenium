package com.example.seleniumproject;


import com.example.seleniumproject.service.Service;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;

import static com.example.seleniumproject.constants.MyBrowser.CHROME;
import static com.example.seleniumproject.constants.firstandseconcase.URLFirstAndSecondCase.*;



@Slf4j
public class TestCase1 {
   public static Service service;
   public static String browser = CHROME;

   @BeforeClass
   public static void setDriver() {
      service = new Service();
      service.setUp(browser);
   }

   @AfterClass
   public void tearDown() {
       service.tearDown();
   }

   @Test(priority = 1)
   public void loginWithUsernameAndPassword()  {
       service.login(LOGIN_PAGE);
   }

   @Test(priority = 2)
   public void checksIfHeaderIsPresentAfterSuccessfulLogin() {
       service.verifyHeaderIsPresent(INVENTORY_PAGE);
   }

    @Test(priority = 3)
    public void checksIfShoppingCartIsPresentAfterSuccessfulLogin() {
        service.verifyShoppingCartIsPresent(INVENTORY_PAGE);
    }

    @Test(priority = 4)
    public void checksIfTwitterFacebookAndLinkedInArePresentAfterSuccessfulLogin() {
        service.verifyTwitterFacebookAndLinkedinArePresent(INVENTORY_PAGE);
    }

    @Test(priority = 7)
    public void checksIfBurgerMenuIsPresentAfterSuccessfulLogin() {
        service.verifyBurgerMenuIsPresent(INVENTORY_PAGE);
    }

    @Test(priority = 8)
    public void checksIfLogoutIsPresentAfterSuccessfulLogin() {
        service.verifyLogoutIsPresent(INVENTORY_PAGE);
    }
}