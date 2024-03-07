package com.solvd.carina.demo.gui.automationExercise.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AutomationProductsContainer extends AbstractUIObject {

    @FindBy(xpath = "")
    private ExtendedWebElement containerTitle;
    @FindBy(xpath = "")
    private ExtendedWebElement productTitle;
    @FindBy(xpath = "")
    private ExtendedWebElement productPrice;
    @FindBy(xpath = "")
    private ExtendedWebElement productImage;
    @FindBy(xpath = "")
    private ExtendedWebElement addToCartButton;
    @FindBy(xpath = "")
    private ExtendedWebElement viewProductButton;
    @FindBy(xpath = "")
    private List<ExtendedWebElement> productsPriceList;
    @FindBy(xpath = "")
    private List<ExtendedWebElement> productsTitleList;

    public AutomationProductsContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
