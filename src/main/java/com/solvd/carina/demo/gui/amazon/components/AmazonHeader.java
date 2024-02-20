package com.solvd.carina.demo.gui.amazon.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class AmazonHeader extends AbstractUIObject {

    private ExtendedWebElement amazonLogoButton;
    private ExtendedWebElement deliverToButton;
    private ExtendedWebElement searchInButton;
    private ExtendedWebElement searchInputField;
    private ExtendedWebElement searchButton;
    private ExtendedWebElement languageButton;
    private ExtendedWebElement signInButton;
    private ExtendedWebElement returnsAndOrdersButton;
    private ExtendedWebElement cartButton;

    public AmazonHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
