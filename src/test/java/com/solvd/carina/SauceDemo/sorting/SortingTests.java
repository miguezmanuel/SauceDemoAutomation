package com.solvd.carina.SauceDemo.sorting;

import com.solvd.carina.demo.gui.sauceDemo.pages.InventoryPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.LoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingTests implements IAbstractTest {

    @Test
    public void verifySortingLowToHigh() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(getDriver());
        inventoryPage.selectSortingOption("Price (low to high)");

        Assert.assertTrue(inventoryPage.isSortedLowToHigh(), "Sorting (Low to High) did not work!");
    }

    @Test
    public void verifySortingHighToLow() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(getDriver());
        inventoryPage.selectSortingOption("Price (high to low)");

        Assert.assertTrue(inventoryPage.isSortedHighToLow(), "Sorting (High to Low) did not work");
    }

    @Test
    public void verifySortingByNameAscending() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(getDriver());
        inventoryPage.selectSortingOption("Name (A to Z)");

        Assert.assertTrue(inventoryPage.isSortedByNameAscending(), "Sorting (A to Z) did not work :(");
    }

    @Test
    public void verifySortingByNameDescending() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(getDriver());
        inventoryPage.selectSortingOption("Name (Z to A)");

        Assert.assertTrue(inventoryPage.isSortedByNameDescending(), "Sorting (Z to A) did not work!");
    }
}