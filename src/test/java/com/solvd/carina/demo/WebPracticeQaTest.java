package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.PracticeQA.components.PracticeCartItemsContainer;
import com.solvd.carina.demo.gui.PracticeQA.components.PracticeItemsContainer;
import com.solvd.carina.demo.gui.PracticeQA.pages.PracticeProductsPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.config.Configuration;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

//https://qa-practice.netlify.app/
public class WebPracticeQaTest implements IAbstractTest {

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

    private void addToCart (String name) {
        PracticeProductsPage productsPage = new PracticeProductsPage(getDriver());
        PracticeItemsContainer itemsContainer = productsPage.getItemsContainer();

        itemsContainer.clickAddToCartByItem(name);
    }

    @DataProvider(name = "productsData")
    private Object[][] productsData () {
        return new Object[][] {
                {"Apple iPhone 12, 128GB, Black","$905.99"},
                {"Huawei Mate 20 Lite, 64GB, Black","$236.12"}
        };
    }
}
