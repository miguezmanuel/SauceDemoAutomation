package com.solvd.carina.demo.gui.swaglabs.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsSecondHeader extends AbstractUIObject {

    @FindBy(xpath = "//span[@class='title']")
    private ExtendedWebElement productsTitleText;
    @FindBy(xpath = "//*[@class='product_sort_container']")
    private ExtendedWebElement filterButton;
    @FindBy(xpath = "//option[@value='az']")
    private ExtendedWebElement nameAtoZ;
    @FindBy(xpath = "//option[@value='za']")
    private ExtendedWebElement nameZtoA;
    @FindBy(xpath = "//option[@value='lohi']")
    private ExtendedWebElement priceLowToHigh;
    @FindBy(xpath = "//option[@value='hilo']")
    private ExtendedWebElement priceHighToLow;

    public SwagLabsSecondHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isProductTitleTextPresent () {
        return isProductTitleTextPresent();
    }

    public String productsTitleText () {
        return productsTitleText.getText();
    }

    public void clickFilterButton () {
        filterButton.click();
    }

    public void selectNameAtoZOption () {
        nameAtoZ.click();
    }

    public void selectNameZtoAOption () {
        nameZtoA.click();
    }

    public void selectPriceLowToHighOption () {
        priceLowToHigh.click();
    }

    public void selectPriceHighToLowOption () {
        priceHighToLow.click();
    }

}
