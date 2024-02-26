package com.solvd.carina.demo.gui.amazon.pages;

import com.solvd.carina.demo.gui.amazon.components.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonTodayDealsPage extends AmazonAbstractPage {

    @FindBy(xpath = "//div[@class='a-row a-carousel-controls a-carousel-row a-carousel-has-buttons']")
    private AmazonDealsCarousel amazonDealsCarousel;

    public AmazonTodayDealsPage(WebDriver driver) {
        super(driver);
    }

    public AmazonDealsCarousel getAmazonDealsCarousel() {
        return amazonDealsCarousel;
    }

    @Override
    public AmazonHeader getAmazonHeader() {
        return super.getAmazonHeader();
    }

    @Override
    public AmazonChoseLocationCard getAmazonChoseLocationCard() {
        return super.getAmazonChoseLocationCard();
    }

    @Override
    public AmazonSearchBar getAmazonSearchBar() {
        return super.getAmazonSearchBar();
    }

    @Override
    public AmazonShopNavigationBar getAmazonShopNavigationBar() {
        return super.getAmazonShopNavigationBar();
    }
}
