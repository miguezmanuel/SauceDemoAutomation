package com.solvd.carina.demo.gui.automationExercise.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationAddedToCartPopUp extends AbstractUIObject {

    @FindBy(css = "button.btn.btn-success.close-modal")
    private ExtendedWebElement continueShoppingButton;

    public AutomationAddedToCartPopUp(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickContinueShoppingButton () {
        continueShoppingButton.click();
    }
}
