package com.solvd.carina.demo.gui.automationExercise.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AutomationProductsContainer extends AbstractUIObject {

    Logger logger = (Logger) LogManager.getLogger();

    @FindBy(css = ".productinfo.text-center p")
    private ExtendedWebElement productTitle;
    @FindBy(css = ".productinfo.text-center h2")
    private ExtendedWebElement productPrice;
    @FindBy(css = ".btn.add-to-cart")
    private ExtendedWebElement addToCartButton;
    @FindBy(css = ".productinfo.text-center .add-to-cart")
    private ExtendedWebElement hoverAddToCartButton;

    @FindBy(css = ".productinfo.text-center h2")
    private List<ExtendedWebElement> productsPriceList;
    @FindBy(css = ".productinfo.text-center p")
    private List<ExtendedWebElement> productsTitleList;

    public AutomationProductsContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickProductTitle (String itemTitle) {
        productTitle.format(productTitle).click();
    }

    public void clickProductPrice (String itemTitle) {
        productPrice.format(itemTitle).click();
    }

    public String getProductPrice (String itemTitle) {
        return productPrice.format(itemTitle).getText();
    }

    public void clickAddToCartButton (String itemTitle) {
        addToCartButton.format(itemTitle).click();
    }

    public void clickHoverAddToCartButton() {
        hoverAddToCartButton.click();
    }

    public List<String> getPricesList () {
        List <String> list = new ArrayList<>();

        for (int i = 0; i < productsPriceList.size(); i++) {
            String element = productsPriceList.get(i).getText();
            list.add(element);
        }

        logger.info(list);
        return list;
    }

    public List<String> getTitlesList () {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < productsTitleList.size(); i++) {
            list.add(productsTitleList.get(i).getText());
        }

        return list;
    }
}
