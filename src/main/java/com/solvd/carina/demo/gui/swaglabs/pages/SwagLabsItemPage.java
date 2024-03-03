package com.solvd.carina.demo.gui.swaglabs.pages;

import com.solvd.carina.demo.gui.swaglabs.common.SwagLabsBasePage;
import com.solvd.carina.demo.gui.swaglabs.components.SwagLabsHeader;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public class SwagLabsItemPage extends SwagLabsBasePage {

    private ExtendedWebElement backToProductsButton;
    private ExtendedWebElement addToCartButton;
    private ExtendedWebElement removeButton;
    private ExtendedWebElement itemTitle;
    private ExtendedWebElement itemDescription;
    private ExtendedWebElement itemPrice;
    public SwagLabsItemPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public SwagLabsHeader getHeader() {
        return super.getHeader();
    }
}
