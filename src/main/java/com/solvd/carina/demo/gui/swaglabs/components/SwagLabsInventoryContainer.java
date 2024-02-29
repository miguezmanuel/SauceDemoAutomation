package com.solvd.carina.demo.gui.swaglabs.components;

import com.solvd.carina.demo.gui.swaglabs.pages.SwagLabsItemPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwagLabsInventoryContainer extends AbstractUIObject {

    @FindBy(xpath = "//div[@class='inventory_item_name '][text()='%s']")
    private ExtendedWebElement itemTitle;
    @FindBy(xpath = "//div[@class='inventory_item_price'][text()='%s']")
    private ExtendedWebElement itemPrice;
    @FindBy(xpath = "//div[text()='%s']/following::div[@class='inventory_item_desc'][1]")
    private ExtendedWebElement itemDescription;
    @FindBy(xpath = "//img[@alt='%s']")
    private ExtendedWebElement itemImage;
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//button")
    private ExtendedWebElement addToCartButton;
    @FindBy(xpath = "//div[@class='inventory_item_name ']")
    private List<ExtendedWebElement> itemsTitleList;
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private List<ExtendedWebElement> itemsPriceList;

    public SwagLabsInventoryContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickAddToCartButton () {
        addToCartButton.click();
    }

    public SwagLabsItemPage clickItemTitle (String elementName) {
        itemTitle.format(elementName).click();
        return new SwagLabsItemPage(getDriver());
    }

    public String getItemTitle (String elementName) {
        return itemTitle.format(elementName).getText();
    }

    public String getItemPrice (String elementPrice) {
        return "$" + itemPrice.format(elementPrice).getText();
    }

    public String getDescription (String elementName) {
        return itemDescription.format(elementName).getText();
    }

    public String getImageUrl (String elementName) {
        return itemImage.format(elementName).getAttribute("src");
    }




}
