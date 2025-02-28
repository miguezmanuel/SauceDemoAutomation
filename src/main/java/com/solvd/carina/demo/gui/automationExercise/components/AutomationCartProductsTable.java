package com.solvd.carina.demo.gui.automationExercise.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AutomationCartProductsTable extends AbstractUIObject {

    @FindBy(css = ".cart_description h4 a")
    private List<ExtendedWebElement> productsTitleList;
    @FindBy(css = ".cart_price p")
    private List<ExtendedWebElement> productsPriceList;
    @FindBy(css = ".cart_total_price")
    private List<ExtendedWebElement> productsTotalPriceList;

    @FindBy(xpath = "//a[contains(@href, '/product_details/')][text()='%s']")
    private ExtendedWebElement productTitle;

    public AutomationCartProductsTable(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public List<String> getProductTitleList () {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < productsTitleList.size(); i++) {
            String element = productsTitleList.get(i).getText();
            list.add(element);
        }

        return list;
    }

    public List<String> getProductsPriceList() {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < productsPriceList.size(); i++) {
            String element = productsPriceList.get(i).getText();
            list.add(element);
        }

        return list;
    }

    public List<String> getProductsTotalPriceList () {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < productsTotalPriceList.size(); i++) {
            String element = productsTotalPriceList.get(i).getText();
            list.add(element);
        }

        return list;
    }


    public String getProductTitleFromName (String name) {
    return productTitle.format(name).getText();
    }




}
