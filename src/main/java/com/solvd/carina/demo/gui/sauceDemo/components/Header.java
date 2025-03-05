package com.solvd.carina.demo.gui.sauceDemo.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {

    @FindBy(id = "react-burger-menu-btn")
    private ExtendedWebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    private ExtendedWebElement logoutButton;

    @FindBy(id = "shopping_cart_container")
    private ExtendedWebElement cartButton;

    protected Header(WebDriver driver, SearchContext searchContext) {
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