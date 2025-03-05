package com.solvd.carina.SauceDemo.checkout;

import com.solvd.carina.demo.gui.sauceDemo.pages.CartPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.CheckoutPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.InventoryPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.LoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTests implements IAbstractTest {

    @Test
    public void checkoutCompleteOrder() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(getDriver());
        inventoryPage.addProductToCart(0);
        inventoryPage.openCart();

        CartPage cartPage = new CartPage(getDriver());
        cartPage.clickCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        checkoutPage.fillCheckoutInfo("John", "Doe", "12345");
        checkoutPage.completeOrder();

        Assert.assertTrue(checkoutPage.isOrderSuccessful(), "Order was not completed successfully!");
    }

    @Test
    public void checkoutWithMissingInformation() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(getDriver());
        inventoryPage.addProductToCart(0);
        inventoryPage.openCart();

        CartPage cartPage = new CartPage(getDriver());
        cartPage.clickCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        checkoutPage.fillCheckoutInfo("", "", "");

        Assert.assertTrue(checkoutPage.isErrorDisplayed(), "Error message was not displayed!");
    }
}
