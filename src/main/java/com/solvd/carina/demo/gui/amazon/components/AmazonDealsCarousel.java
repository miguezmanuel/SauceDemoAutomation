package com.solvd.carina.demo.gui.amazon.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonDealsCarousel extends AbstractUIObject {

    @FindBy(xpath = "//a[@class='a-button a-button-image a-carousel-button a-carousel-goto-prevpage']")
    private ExtendedWebElement goToPrevPageButton;

    @FindBy(xpath = "//a[@class='a-button a-button-image a-carousel-button a-carousel-goto-nextpage']")
    private ExtendedWebElement goToRightButton;

    @FindBy(xpath = "//li[@class='a-carousel-card GridPresets-module__gridPresetElement_LK6M4HpuBZHEa3NTWKSb9']")
    private List<WebElement> carouselElements;

    public AmazonDealsCarousel(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public List<WebElement> getCarouselElements () {
        return carouselElements;
    }
}
