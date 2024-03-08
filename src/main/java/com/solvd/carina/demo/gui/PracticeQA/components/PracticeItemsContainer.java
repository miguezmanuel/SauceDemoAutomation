package com.solvd.carina.demo.gui.PracticeQA.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class PracticeItemsContainer extends AbstractUIObject {

    @FindBy(xpath = "//span[@class='shop-item-price'][text()='$%s']")
    private ExtendedWebElement itemPrice;
    @FindBy(xpath = "//span[@class='shop-item-title'][text()='%s']")
    private ExtendedWebElement itemTitle;
    @FindBy(xpath = "//span[@class='shop-item-title'][text()='%s']/..//img")
    private ExtendedWebElement itemImage;
    @FindBy(xpath = "//button[@class='btn btn-primary shop-item-button']/ancestor::div[@class='shop-item']//span[text()='%s']")
    private ExtendedWebElement addToCartByItem;
    @FindBy(xpath = "//span[@class='shop-item-title']")
    private List<ExtendedWebElement> itemTitlesList;
    @FindBy(xpath = "//span[@class='shop-item-price']")
    private List<ExtendedWebElement> itemPricesList;
    public PracticeItemsContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickAddToCartByItem (String name) {
        addToCartByItem.format(name).click();
    }

    public List<String> getItemsTitleList () {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < itemTitlesList.size() - 1; i++) {
            String element = itemTitlesList.get(i).getText();
            list.add(element);
        }

        return list;
    }

    public List<String> getItemsPricesList () {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < itemPricesList.size() - 1; i++) {
            String element = itemPricesList.get(i).getText();
            list.add(element);
        }

        return list;
    }
}
