package com.solvd.carina.demo.gui.automationExercise.common;

import com.solvd.carina.demo.gui.automationExercise.components.*;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationBasePage extends AbstractPage {

    @FindBy(id = "header")
    private AutomationHeader header;
    @FindBy(css = ".features_items")
    private AutomationProductsContainer productsContainer;
    @FindBy(id = "cart_items")
    private AutomationCartProductsTable cartProductsTable;
    @FindBy(id = "cartModal")
    private AutomationAddedToCartPopUp addedToCartAlert;

    public AutomationBasePage(WebDriver driver) {
        super(driver);
    }

    public AutomationHeader getHeader() {
        return header;
    }

    public AutomationProductsContainer getProductsContainer() {
        return productsContainer;
    }

    public AutomationCartProductsTable getCartProductsTable() {
        return cartProductsTable;
    }

    public AutomationAddedToCartPopUp getAddedToCartAlert() {
        return addedToCartAlert;
    }
}
