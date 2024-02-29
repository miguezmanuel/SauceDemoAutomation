package com.solvd.carina.demo.gui.swaglabs.pages;

import com.solvd.carina.demo.gui.swaglabs.common.SwagLabsBasePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public class SwagLabsCartPage extends SwagLabsBasePage {

    private ExtendedWebElement continueShoppingButton;
    private ExtendedWebElement checkoutButton;

    public SwagLabsCartPage(WebDriver driver) {
        super(driver);
    }
}
