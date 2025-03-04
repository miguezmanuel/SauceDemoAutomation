package com.solvd.carina.SauceDemo.checkout;

import com.solvd.carina.demo.gui.sauceDemo.pages.SauceCartPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.SauceCheckoutPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.SauceInventoryPage;
import com.solvd.carina.demo.gui.sauceDemo.pages.SauceLoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTests implements IAbstractTest {

    @Test
    public void checkoutCompleteOrder() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        SauceInventoryPage inventoryPage = new SauceInventoryPage(getDriver());
        inventoryPage.addProductToCart(0);
        inventoryPage.openCart();

        SauceCartPage cartPage = new SauceCartPage(getDriver());
        cartPage.clickCheckout();

        SauceCheckoutPage checkoutPage = new SauceCheckoutPage(getDriver());
        checkoutPage.fillCheckoutInfo("John", "Doe", "12345");
        checkoutPage.completeOrder();

        Assert.assertTrue(checkoutPage.isOrderSuccessful(), "Order was not completed successfully!");
    }

    @Test
    public void checkoutWithMissingInformation() {
        SauceLoginPage loginPage = new SauceLoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        SauceInventoryPage inventoryPage = new SauceInventoryPage(getDriver());
        inventoryPage.addProductToCart(0);
        inventoryPage.openCart();

        SauceCartPage cartPage = new SauceCartPage(getDriver());
        cartPage.clickCheckout();

        SauceCheckoutPage checkoutPage = new SauceCheckoutPage(getDriver());
        checkoutPage.fillCheckoutInfo("", "", "");

        Assert.assertTrue(checkoutPage.isErrorDisplayed(), "Error message was not displayed!");
    }
}
