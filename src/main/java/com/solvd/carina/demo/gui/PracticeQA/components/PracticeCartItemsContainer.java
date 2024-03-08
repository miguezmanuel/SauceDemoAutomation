package com.solvd.carina.demo.gui.PracticeQA.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class PracticeCartItemsContainer extends AbstractUIObject {

    @FindBy(xpath = "//span[@class='cart-item-title'][text()='%s']")
    private ExtendedWebElement itemTitle;
    @FindBy(xpath = "//span[@class='cart-price cart-column'][contains(text(),'$%s')]")
    private ExtendedWebElement itemPrice;
    @FindBy(xpath = "//span[@class='cart-item-title'][text()='%s']/../../descendant::button")
    private ExtendedWebElement removeButtonByTitle;
    @FindBy(xpath = "//span[@class='cart-item-title']")
    private List<ExtendedWebElement> itemTitlesList;
    @FindBy(xpath = "//span[@class='cart-price cart-column']")
    private List<ExtendedWebElement> itemPricesList;

    public PracticeCartItemsContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isTitlePresent (String name) {
        return itemTitle.format(name).isPresent();
    }

    public String getItemTitleByName (String name) {
        return itemTitle.format(name).getText();
    }

    public String getItemPriceByName (String price) {
        return itemPrice.format(price).getText();
    }

    public void removeItemFromCartByName (String name) {
        removeButtonByTitle.format(name).click();
    }

    public List<String> getItemTitlesList () {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < itemTitlesList.size() - 1; i++) {
            String element = itemTitlesList.get(i).getText();
            list.add(element);
        }

        return list;
    }

    public List<String> getPricesList () {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < itemPricesList.size() - 1; i++) {
            String element = itemPricesList.get(i).getText();
            list.add(element);
        }

        return list;
    }
}
