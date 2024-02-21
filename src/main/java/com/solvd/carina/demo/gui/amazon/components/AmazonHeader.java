package com.solvd.carina.demo.gui.amazon.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonHeader extends AbstractUIObject {

    @FindBy(css = "a#nav-logo-sprites")
    private ExtendedWebElement amazonLogoButton;
    @FindBy(css = "a#nav-global-location-popover-link")
    private ExtendedWebElement deliverToButton;
    @FindBy(xpath = "//*[@aria-describedby='searchDropdownDescription']")
    private ExtendedWebElement searchInButton;
    @FindBy(css = "input#twotabsearchtextbox")
    private ExtendedWebElement searchInputField;
    @FindBy(css = "input#nav-search-submit-button")
    private ExtendedWebElement searchButton;
    @FindBy(xpath = "//*[@id='nav-tools']//span[@class='icp-nav-link-inner']")
    private ExtendedWebElement languageButton;
    @FindBy(css = "a#nav-link-accountList")
    private ExtendedWebElement signInButton;
    @FindBy(css = "a#nav-orders")
    private ExtendedWebElement returnsAndOrdersButton;
    @FindBy(css = "a#nav-cart")
    private ExtendedWebElement cartButton;

    public AmazonHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isAmazonLogoPresent () {
        return amazonLogoButton.isPresent();
    }

    public void clickAmazonLogo () {
        amazonLogoButton.click();
    }

    public void clickDeliverButton () {
        deliverToButton.click();
    }

    public void clickSearchInButton () {
        searchInButton.click();
    }

    public void typeSearchInputField (String searchInput) {
        searchInputField.type(searchInput);
    }

    public void clickSearchButton () {
        searchButton.click();
    }

    public void hoverLanguageButton () {
        languageButton.hover();
    }

    public void clickSignInButton () {
        signInButton.click();
    }

    public void clickReturnAndOrdersButton () {
        returnsAndOrdersButton.click();
    }

    public void clickCartButton () {
        cartButton.click();
    }
}
