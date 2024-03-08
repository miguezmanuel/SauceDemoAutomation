package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.PracticeQA.components.PracticeCartItemsContainer;
import com.solvd.carina.demo.gui.PracticeQA.components.PracticeItemsContainer;
import com.solvd.carina.demo.gui.PracticeQA.components.PracticeLoginForm;
import com.solvd.carina.demo.gui.PracticeQA.pages.PracticeLoginPage;
import com.solvd.carina.demo.gui.PracticeQA.pages.PracticeProductsPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.config.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

//https://qa-practice.netlify.app/
public class WebPracticeQaTest implements IAbstractTest {

    Logger logger = (Logger) LogManager.getLogger();

    @Test(dataProvider = "productsData")
    public void checkCartItems (String name, String price) {
        PracticeProductsPage productsPage = new PracticeProductsPage(getDriver());
        PracticeItemsContainer itemsContainer = productsPage.getItemsContainer();
        PracticeCartItemsContainer cartItemsContainer = productsPage.getCartItemsContainer();

        getDriver().navigate().to("https://qa-practice.netlify.app/products_list");

        addToCart(name);

        List<String> cartList = cartItemsContainer.getPricesList();
        List<String> productsList = itemsContainer.getItemsPricesList();

        for (int i = 0; i < cartList.size(); i++) {
            String element = cartList.get(i);
            String elementTwo = productsList.get(i);
            Assert.assertEquals(element, elementTwo);
        }

    }

    @Test
    public void checkProductsList () {
        PracticeProductsPage productsPage = new PracticeProductsPage(getDriver());
        PracticeItemsContainer practiceItemsContainer = productsPage.getItemsContainer();

        getDriver().navigate().to("https://qa-practice.netlify.app/products_list");

        List<String> productsList = practiceItemsContainer.getItemsTitleList();
        logger.info(productsList);
        Assert.assertTrue(!productsList.isEmpty(), "list empty");
    }

    private void addToCart (String name) {
        PracticeProductsPage productsPage = new PracticeProductsPage(getDriver());
        PracticeItemsContainer itemsContainer = productsPage.getItemsContainer();
        PracticeCartItemsContainer cartItemsContainer = productsPage.getCartItemsContainer();

        FluentWait fluentWait = new FluentWait<>(getDriver());
        getDriver().navigate().to("https://qa-practice.netlify.app/products_list");

        itemsContainer.clickAddToCartByItem(name);
        Assert.assertTrue(cartItemsContainer.isTitlePresent(name), "title not present, add to cart button does not work");
        cartItemsContainer.removeItemFromCartByName(name);
        Assert.assertFalse(cartItemsContainer.isTitlePresent(name), "title present, remove button does not work");
    }

    @DataProvider(name = "productsData")
    private Object[][] productsData () {
        return new Object[][] {
                {"Apple iPhone 12, 128GB, Black","$905.99"},
                {"Huawei Mate 20 Lite, 64GB, Black","$236.12"}
        };
    }

    @Test(dataProvider = "loginWrongData")
    public void checkLoginFormTest (String email, String password) {
        PracticeLoginPage loginPage = new PracticeLoginPage(getDriver());
        PracticeLoginForm loginForm = loginPage.getLoginForm();
        FluentWait fluentWait = new FluentWait<>(getDriver());

        getDriver().navigate().to("https://qa-practice.netlify.app/auth_ecommerce");
        fluentWait.until(ExpectedConditions.urlContains("auth_ecommerce"));
        Assert.assertTrue(loginForm.isLoginTitlePresent());

        login(email, password);
        Assert.assertTrue(loginForm.isBadCredentialsPresent(), "bad credentials did not appear");

        login("admin@admin.com", "admin123");
        Assert.assertFalse(loginForm.isBadCredentialsPresent(), "bad credentials appeared when not expected");
    }


    private void login (String emailInfo, String passwordInfo) {
        PracticeLoginPage loginPage = new PracticeLoginPage(getDriver());
        PracticeLoginForm loginForm = loginPage.getLoginForm();

        loginForm.typeEmailInputField(emailInfo);
        loginForm.typePasswordInputField(passwordInfo);
        loginForm.clickSubmitButton();
    }
    @DataProvider
    private Object[][] loginWrongData () {
        return new Object[][] {
                {"josecabj@gmail.com", "cavani"},
                {"manucai@gmail.com", "mancuello"}
        };
    }
}
