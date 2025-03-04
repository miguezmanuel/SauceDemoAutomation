package com.solvd.carina.AutomationExercise;

import com.solvd.carina.demo.gui.automationExercise.components.AutomationAddedToCartPopUp;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationCartProductsTable;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationHeader;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationProductsContainer;
import com.solvd.carina.demo.gui.automationExercise.pages.AutomationCartPage;
import com.solvd.carina.demo.gui.automationExercise.pages.AutomationHomePage;
import com.solvd.carina.demo.gui.automationExercise.pages.AutomationProductsPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class InterviewTaskTest implements IAbstractTest {

    @Test(dataProvider = "productsData")
    public void addProductsToCartTest(String productName, String expectedPrice, String expectedTotalPrice) {
        AutomationHomePage homePage = new AutomationHomePage(getDriver());
        AutomationHeader header = homePage.getHeader();
        AutomationProductsPage productsPage = new AutomationProductsPage(getDriver());
        AutomationProductsContainer productsContainer = productsPage.getProductsContainer();
        AutomationAddedToCartPopUp addedToCartAlert = productsPage.getAddedToCartAlert();
        AutomationCartPage cartPage = new AutomationCartPage(getDriver());
        AutomationCartProductsTable cartProductsTable = cartPage.getCartProductsTable();

        getDriver().navigate().to("http://automationexercise.com");

        Assert.assertTrue(homePage.getHeader().isLogoButtonPresent(), "Home page is not visible!");

        header.clickProductsButton();

        productsContainer.clickHoverAddToCartButton();
        addedToCartAlert.clickContinueShoppingButton();

        header.clickCartButton();

        List<String> cartProducts = cartProductsTable.getProductTitleList();
        Assert.assertTrue(cartProducts.contains(productName), productName + " not found in cart!");

        List<String> prices = cartProductsTable.getProductsPriceList();
        Assert.assertTrue(prices.contains(expectedPrice), "Price for " + productName + " is incorrect!");

        List<String> totalPrices = cartProductsTable.getProductsTotalPriceList();
        Assert.assertTrue(totalPrices.contains(expectedTotalPrice), "Total price for " + productName + " is incorrect!");
    }

    @DataProvider(name = "productsData")
    public Object[][] productsData() {
        return new Object[][]{
                {"Blue Top", "Rs. 500", "Rs. 500"},
                {"Men Tshirt", "Rs. 400", "Rs. 400"}
        };
    }

}

