package com.solvd.carina.demo.gui.automationExercise.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationAddedToCartAlert extends AbstractUIObject {

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private ExtendedWebElement continueShoppingButton;

    public AutomationAddedToCartAlert(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickContinueShoppingButton () {
        continueShoppingButton.click();
    }
}
