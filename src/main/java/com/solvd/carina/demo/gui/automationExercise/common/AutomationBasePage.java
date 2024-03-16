package com.solvd.carina.demo.gui.automationExercise.common;

import com.solvd.carina.demo.gui.automationExercise.components.*;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationBasePage extends AbstractPage {

    @FindBy(xpath = "//div[@class='login-form']")
    private AutomationLoginForm loginForm;
    @FindBy(xpath = "//div[@class='signup-form']")
    private AutomationSignUpForm signUpForm;
    @FindBy(xpath = "//div[@class='logo pull-left']/ancestor::div[@class='row']")
    private AutomationHeader header;
    @FindBy(xpath = "//div[@class='features_items']")
    private AutomationProductsContainer productsContainer;
    @FindBy(xpath = "//div[@class='table-responsive cart_info']")
    private AutomationCartProducstTable cartProductsTable;
    @FindBy(xpath = "//div[@class='modal-content']")
    private AutomationAddedToCartAlert addedToCartAlert;
    @FindBy(xpath = "//form[@id='contact-us-form']")
    private AutomationGetInTouchForm getInTouchForm;
    @FindBy(xpath = "//section[@id='form']/descendant::div[@class='container']")
    private AutomationApiTestingContainer testingContainer;

    public AutomationBasePage(WebDriver driver) {
        super(driver);
    }

    public AutomationLoginForm getLoginForm() {
        return loginForm;
    }

    public AutomationSignUpForm getSignUpForm() {
        return signUpForm;
    }

    public AutomationHeader getHeader() {
        return header;
    }

    public AutomationProductsContainer getProductsContainer() {
        return productsContainer;
    }

    public AutomationCartProducstTable getCartProductsTable() {
        return cartProductsTable;
    }

    public AutomationAddedToCartAlert getAddedToCartAlert() {
        return addedToCartAlert;
    }

    public AutomationGetInTouchForm getGetInTouchForm() {
        return getInTouchForm;
    }

    public AutomationApiTestingContainer getTestingContainer() {
        return testingContainer;
    }
}
