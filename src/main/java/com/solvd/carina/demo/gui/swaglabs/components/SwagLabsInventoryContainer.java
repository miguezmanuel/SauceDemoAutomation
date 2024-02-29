package com.solvd.carina.demo.gui.swaglabs.components;

import com.solvd.carina.demo.gui.swaglabs.pages.SwagLabsItemPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsInventoryContainer extends AbstractUIObject {

    @FindBy(xpath = "//div[@class='inventory_item_name '][text()='%s']")
    private ExtendedWebElement itemTitle;
    @FindBy(xpath = "")
    private ExtendedWebElement itemPrice;
    @FindBy(xpath = "")
    private ExtendedWebElement itemDescription;
    @FindBy(xpath = "")
    private ExtendedWebElement itemImage;

    public SwagLabsInventoryContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SwagLabsItemPage clickItemTitle (String elementName) {
        itemTitle.format(elementName).click();
        return new SwagLabsItemPage(getDriver());
    }
}
