package com.solvd.carina.demo.gui.automationExercise.components;

import com.solvd.carina.demo.gui.automationExercise.pages.AutomationCartPage;
import com.solvd.carina.demo.gui.automationExercise.pages.AutomationHomePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationHeader extends AbstractUIObject {

    @FindBy(css = ".logo.pull-left img")
    private ExtendedWebElement logoButton;
    @FindBy(css = ".nav.navbar-nav a[href='/products']")
    private ExtendedWebElement productsButton;
    @FindBy(css = ".nav.navbar-nav a[href='/view_cart']")
    private ExtendedWebElement cartButton;

    public AutomationHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isLogoButtonPresent () {
        return logoButton.isPresent();
    }

    public AutomationHomePage clickLogoButton () {
        logoButton.click();
        return new AutomationHomePage(getDriver());
    }

    public void clickProductsButton () {
        productsButton.click();
    }

    public AutomationCartPage clickCartButton () {
        cartButton.click();
        return new AutomationCartPage(getDriver());
    }

}
