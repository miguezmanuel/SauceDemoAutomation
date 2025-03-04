package com.solvd.carina.SauceDemo.sorting;

import com.solvd.carina.demo.gui.sauceDemo.pages.SauceInventoryPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.SauceLoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingTests implements IAbstractTest {

    @Test
    public void verifySortingLowToHigh() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        SauceInventoryPage inventoryPage = new SauceInventoryPage(getDriver());
        inventoryPage.selectSortingOption("Price (low to high)");

        Assert.assertTrue(inventoryPage.isSortedLowToHigh(), "Sorting (Low to High) did not work!");
    }

    @Test
    public void verifySortingHighToLow() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        SauceInventoryPage inventoryPage = new SauceInventoryPage(getDriver());
        inventoryPage.selectSortingOption("Price (high to low)");

        Assert.assertTrue(inventoryPage.isSortedHighToLow(), "Sorting (High to Low) did not work");
    }

    @Test
    public void verifySortingByNameAscending() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        SauceInventoryPage inventoryPage = new SauceInventoryPage(getDriver());
        inventoryPage.selectSortingOption("Name (A to Z)");

        Assert.assertTrue(inventoryPage.isSortedByNameAscending(), "Sorting (A to Z) did not work :(");
    }

    @Test
    public void verifySortingByNameDescending() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        SauceInventoryPage inventoryPage = new SauceInventoryPage(getDriver());
        inventoryPage.selectSortingOption("Name (Z to A)");

        Assert.assertTrue(inventoryPage.isSortedByNameDescending(), "Sorting (Z to A) did not work!");
    }
}