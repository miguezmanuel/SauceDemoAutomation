package com.solvd.carina.SauceDemo.authentication;

import com.solvd.carina.demo.gui.sauceDemo.pages.SauceInventoryPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.SauceLoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests implements IAbstractTest {

    @Test
    public void loginWithValidCredentials() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        SauceInventoryPage inventoryPage = new SauceInventoryPage(getDriver());
        Assert.assertTrue(inventoryPage.isPageLoaded(), "Login failed!");
    }

    @Test
    public void loginWithInvalidCredentials() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("invalid_user", "wrong_password");

        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service.");
    }

    @Test
    public void loginWithLockedOutUser() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("locked_out_user", "secret_sauce");

        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Sorry, this user has been locked out.");
    }
}