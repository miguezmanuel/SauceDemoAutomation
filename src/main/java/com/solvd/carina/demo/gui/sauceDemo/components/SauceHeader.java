package com.solvd.carina.demo.gui.sauceDemo.components;

import com.solvd.carina.demo.gui.sauceDemo.common.SauceBasePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SauceHeader extends AbstractUIObject {

    @FindBy(id = "react-burger-menu-btn")
    private ExtendedWebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    private ExtendedWebElement logoutButton;

    @FindBy(css = ".shopping_cart_link")
    private ExtendedWebElement cartButton;

    protected SauceHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void openMenu() {
        menuButton.click();
    }

    public void logout() {
        openMenu();
        logoutButton.click();
    }

    public void openCart() {
        cartButton.click();
    }
}