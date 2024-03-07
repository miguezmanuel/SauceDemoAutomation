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

    @FindBy(xpath = "//h2[@class='title text-center']")
    private ExtendedWebElement containerTitle;
    @FindBy(xpath = "//div[@class='productinfo text-center']/descendant::p[text()='%s']")
    private ExtendedWebElement productTitle;
    @FindBy(xpath = "//div[contains(@class, 'productinfo')]//p[contains(text(), '%s')]/preceding-sibling::h2")
    private ExtendedWebElement productPrice;
    @FindBy(xpath = "//div[contains(@class, 'productinfo')]//p[contains(text(), '%s')]/preceding-sibling::img")
    private ExtendedWebElement productImage;
    @FindBy(xpath = "//div[contains(@class, 'productinfo')]//p[contains(text(), '%s')]/following-sibling::a")
    private ExtendedWebElement addToCartButton;
    @FindBy(xpath = "//div[contains(@class, 'productinfo')]//p[contains(text(), '%s')]/ancestor::div[@class='product-image-wrapper']//div[@class='choose']")
    private ExtendedWebElement viewProductButton;
    @FindBy(xpath = "//div[@class='productinfo text-center']/descendant::h2")
    private List<ExtendedWebElement> productsPriceList;
    @FindBy(xpath = "//div[@class='productinfo text-center']/descendant::p")
    private List<ExtendedWebElement> productsTitleList;

    public AutomationProductsContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isContainerTitlePresent () {
        return containerTitle.isPresent();
    }

    public String getContainerTitleXpath () {
        return containerTitle.getLocation().toString();
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

    public String getImageUrl (String itemTitle) {
        return productImage.format(itemTitle).getText();
    }

    public void clickAddToCartButton (String itemTitle) {
        addToCartButton.format(itemTitle).click();
    }

    public void clickViewProductButton (String itemTitle) {
        viewProductButton.format(itemTitle).click();
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
