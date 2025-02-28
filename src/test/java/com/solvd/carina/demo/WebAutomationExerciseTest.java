package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.automationExercise.components.*;
import com.solvd.carina.demo.gui.automationExercise.pages.*;
import com.zebrunner.carina.core.IAbstractTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


//https://www.automationexercise.com/
public class WebAutomationExerciseTest implements IAbstractTest {

    Logger logger = (Logger) LogManager.getLogger();

    @Test
    public void checkTitlesList () {
        AutomationProductsPage productsPage = new AutomationProductsPage(getDriver());
        AutomationProductsContainer productsContainer = productsPage.getProductsContainer();

        getDriver().navigate().to("https://www.automationexercise.com/products");

        List<String> productTitleList = productsContainer.getTitlesList();
        Assert.assertTrue(productTitleList.contains("Blue Top"));

        logger.info(productTitleList);
    }

    @Test
    public void checkPricesList () {
        AutomationProductsPage productsPage = new AutomationProductsPage(getDriver());
        AutomationProductsContainer productsContainer = productsPage.getProductsContainer();

        getDriver().navigate().to("https://www.automationexercise.com/products");

        List<String> productPricesList = productsContainer.getPricesList();
        Assert.assertTrue(productPricesList.contains("Rs. 500"));

        logger.info(productPricesList);
    }

    @Test(dataProvider = "productsData")
    public void checkCartItemAdded (String id, String itemName, String itemPrice) {
        AutomationProductsPage productsPage = new AutomationProductsPage(getDriver());
        AutomationProductsContainer productsContainer = productsPage.getProductsContainer();
        AutomationCartPage cartPage = new AutomationCartPage(getDriver());
        AutomationCartProductsTable cartProductsTable = cartPage.getCartProductsTable();
        AutomationHeader header = productsPage.getHeader();
        AutomationAddedToCartPopUp addedToCartAlert = productsPage.getAddedToCartAlert();

        FluentWait fluentWait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1));

        getDriver().navigate().to("https://www.automationexercise.com/products");
        fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@class='title text-center']")));

        productsContainer.clickAddToCartButton(itemName);
        addedToCartAlert.clickContinueShoppingButton();
        header.clickCartButton();

        List<String> cartProductsTitleList = cartProductsTable.getProductTitleList();
        List<String> cartProductsPriceList = cartProductsTable.getProductsPriceList();

        String productTitle = cartProductsTitleList.get(Integer.parseInt(id));
        String productPrice = cartProductsPriceList.get(Integer.parseInt(id));
        String productTitleByName = cartProductsTable.getProductTitleFromName(itemName);

        Assert.assertEquals(productTitle, itemName);
        Assert.assertEquals(productPrice, itemPrice);
        Assert.assertEquals(productTitle, productTitleByName);

    }

    @DataProvider(name = "productsData")
    public Object [][] productsData () {
        return new Object[][] {
                {"0", "Blue Top", "Rs. 500"},
                {"0", "Men Tshirt", "Rs. 400"},
        };
    }

}
