package com.solvd.carina.demo.gui.amazon.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonShopNavigationBar extends AbstractUIObject {

    @FindBy(css = "a#nav-hamburger-menu")
    private ExtendedWebElement sideMenuButton;
    @FindBy(xpath = "//a[@class='nav-a  ' and text()='Today's Deals']")
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


}
