package com.solvd.carina.demo.gui.swaglabs.pages;

import com.solvd.carina.demo.gui.swaglabs.common.SwagLabsBasePage;
import com.solvd.carina.demo.gui.swaglabs.components.SwagLabsFooter;
import com.solvd.carina.demo.gui.swaglabs.components.SwagLabsHeader;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsItemPage extends SwagLabsBasePage {

    @FindBy(xpath = "//button[@data-test='back-to-products']")
    private ExtendedWebElement backToProductsButton;
    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-backpack']")
    private ExtendedWebElement addToCartButton;
    @FindBy(xpath = "//button[@data-test='remove-sauce-labs-backpack']")
    private ExtendedWebElement removeButton;
    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    private ExtendedWebElement itemTitle;
    @FindBy(xpath = "//div[@class='inventory_details_desc large_size']")
    private ExtendedWebElement itemDescription;
    @FindBy(xpath = "//div[@class='inventory_details_price']")
    private ExtendedWebElement itemPrice;

    public SwagLabsItemPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public SwagLabsHeader getHeader() {
        return super.getHeader();
    }

    @Override
    public SwagLabsFooter getFooter() {
        return super.getFooter();
    }
}
