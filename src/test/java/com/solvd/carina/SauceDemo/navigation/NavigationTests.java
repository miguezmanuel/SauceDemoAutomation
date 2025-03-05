package com.solvd.carina.SauceDemo.navigation;

import com.solvd.carina.demo.gui.sauceDemo.components.Footer;
import com.solvd.carina.demo.gui.sauceDemo.pages.InventoryPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.LoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTests implements IAbstractTest {

    @Test
    public void logoutTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(getDriver());
        inventoryPage.getHeader().logout();

        Assert.assertTrue(loginPage.isLoginPageVisible(), "Logout failed!");
    }

    @Test
    public void verifySocialMediaLinks() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(getDriver());
        Footer footer = inventoryPage.getFooter();

        footer.openTwitter();
        Assert.assertTrue(footer.isTwitterOpened(), "Twitter link did not work!");

        footer.openFacebook();
        Assert.assertTrue(footer.isFacebookOpened(), "Facebook link did not work!");

        footer.openLinkedIn();
        Assert.assertTrue(footer.isLinkedInOpened(), "LinkedIn link did not work!");
    }
}