package com.solvd.carina.demo.gui.amazon.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonHeader extends AbstractUIObject {

    @FindBy(css = "a#nav-logo-sprites")
    private ExtendedWebElement amazonLogoButton;
    @FindBy(css = "a#nav-global-location-popover-link")
    private ExtendedWebElement deliverToButton;
    @FindBy(xpath = "//*[@id='nav-tools']//span[@class='icp-nav-link-inner']")
    private ExtendedWebElement languageButton;
    @FindBy(css = "a#nav-link-accountList")
    private ExtendedWebElement signInButton;
    @FindBy(css = "a#nav-orders")
    private ExtendedWebElement returnsAndOrdersButton;
    @FindBy(css = "a#nav-cart")
    private ExtendedWebElement cartButton;

    @FindBy(xpath = "//div[@class='s-suggestion-trending-container']")
    private List<ExtendedWebElement> searchResultsList;

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
