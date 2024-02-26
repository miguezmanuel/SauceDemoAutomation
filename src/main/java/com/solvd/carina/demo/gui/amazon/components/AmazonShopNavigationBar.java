package com.solvd.carina.demo.gui.amazon.components;

import com.solvd.carina.demo.gui.amazon.pages.AmazonTodayDealsPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonShopNavigationBar extends AbstractUIObject {

    @FindBy(css = "a#nav-hamburger-menu")
    private ExtendedWebElement sideMenuButton;
    @FindBy(xpath = "//*[@id='nav-xshop']/a[1]")
    private ExtendedWebElement todayDealsButton;
    @FindBy(xpath = "//a[@class='nav-a  ' and text()='Customer Service']")
    private ExtendedWebElement customerServiceButton;
    @FindBy(xpath = "//a[@class='nav-a  ' and text()='Registry']")
    private ExtendedWebElement registryButton;
    @FindBy(xpath = "//a[@class='nav-a  ' and text()='Gift Cards']")
    private ExtendedWebElement giftCardsButton;
    @FindBy(xpath = "//a[@class='nav-a  ' and text()='Sell']")
    private ExtendedWebElement sellButton;

    public AmazonShopNavigationBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isSideMenuButtonClickable () {
        return sideMenuButton.isClickable();
    }

    public void clickSideMenuButton () {
        sideMenuButton.click();
    }

    public AmazonTodayDealsPage clickTodayDealsButton () {
        todayDealsButton.click();
        return new AmazonTodayDealsPage(getDriver());
    }

    public void clickCustomerServiceButton () {
        customerServiceButton.click();
    }

    public void clickRegistryButton () {
        registryButton.click();
    }

    public void clickGiftCardsButton () {
        giftCardsButton.click();
    }

    public void ClickSellButton () {
        sellButton.click();
    }


}
