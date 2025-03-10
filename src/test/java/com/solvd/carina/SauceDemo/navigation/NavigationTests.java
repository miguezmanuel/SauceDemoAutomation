package com.solvd.carina.SauceDemo.navigation;

import com.solvd.carina.demo.gui.sauceDemo.components.SauceFooter;
import com.solvd.carina.demo.gui.sauceDemo.pages.SauceInventoryPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.SauceLoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTests implements IAbstractTest {

    @Test
    public void logoutTest() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        SauceInventoryPage inventoryPage = new SauceInventoryPage(getDriver());
        inventoryPage.getHeader().logout();

        Assert.assertTrue(loginPage.isLoginPageVisible(), "Logout failed!");
    }

    @Test
    public void verifySocialMediaLinks() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        SauceInventoryPage inventoryPage = new SauceInventoryPage(getDriver());
        SauceFooter footer = inventoryPage.getFooter();

        footer.openTwitter();
        Assert.assertTrue(footer.isTwitterOpened(), "Twitter link did not work!");

        footer.openFacebook();
        Assert.assertTrue(footer.isFacebookOpened(), "Facebook link did not work!");

        footer.openLinkedIn();
        Assert.assertTrue(footer.isLinkedInOpened(), "LinkedIn link did not work!");
    }
}