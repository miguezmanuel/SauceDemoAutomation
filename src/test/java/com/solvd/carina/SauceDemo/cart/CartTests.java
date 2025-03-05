package com.solvd.carina.SauceDemo.cart;

import com.solvd.carina.demo.gui.sauceDemo.pages.CartPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.InventoryPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.LoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests implements IAbstractTest {

    @Test
    public void addItemToCart() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(getDriver());
        inventoryPage.addProductToCart(0);
        inventoryPage.openCart();

        CartPage cartPage = new CartPage(getDriver());
        Assert.assertTrue(cartPage.isProductInCart("Sauce Labs Backpack"), "Product not found in cart!");
    }

    @Test
    public void removeItemFromCart() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(getDriver());
        inventoryPage.addProductToCart(0);
        inventoryPage.openCart();

        CartPage cartPage = new CartPage(getDriver());
        cartPage.removeProductFromCart("Sauce Labs Backpack");

        Assert.assertFalse(cartPage.isProductInCart("Sauce Labs Backpack"), "Product still present in cart!");
    }
}
