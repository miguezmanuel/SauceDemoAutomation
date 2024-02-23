package com.solvd.carina.demo.gui.amazon.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class AmazonShopNavigationBar extends AbstractUIObject {

    private ExtendedWebElement sideMenuButton;
    private ExtendedWebElement todayDealsButton;
    private ExtendedWebElement customerServiceButton;
    private ExtendedWebElement registryButton;
    private ExtendedWebElement giftCardsButton;
    private ExtendedWebElement sellButton;
    public AmazonShopNavigationBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }


}
