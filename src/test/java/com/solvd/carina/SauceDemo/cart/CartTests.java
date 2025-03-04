package com.solvd.carina.SauceDemo.cart;

import com.solvd.carina.demo.gui.sauceDemo.pages.SauceCartPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.SauceInventoryPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.SauceLoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests implements IAbstractTest {

    @Test
    public void addItemToCart() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        SauceInventoryPage inventoryPage = new SauceInventoryPage(getDriver());
        inventoryPage.addProductToCart(0);
        inventoryPage.openCart();

        SauceCartPage cartPage = new SauceCartPage(getDriver());
        Assert.assertTrue(cartPage.isProductInCart("Sauce Labs Backpack"), "Product not found in cart!");
    }

    @Test
    public void removeItemFromCart() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        SauceInventoryPage inventoryPage = new SauceInventoryPage(getDriver());
        inventoryPage.addProductToCart(0);
        inventoryPage.openCart();

        SauceCartPage cartPage = new SauceCartPage(getDriver());
        cartPage.removeProductFromCart("Sauce Labs Backpack");

        Assert.assertFalse(cartPage.isProductInCart("Sauce Labs Backpack"), "Product still present in cart!");
    }
}
