package com.solvd.carina.demo.gui.amazon.pages;

import com.solvd.carina.demo.gui.amazon.components.AmazonChoseLocationCard;
import com.solvd.carina.demo.gui.amazon.components.AmazonHeader;
import com.solvd.carina.demo.gui.amazon.components.AmazonSearchBar;
import com.solvd.carina.demo.gui.amazon.components.AmazonShopNavigationBar;
import org.openqa.selenium.WebDriver;

public class AmazonTodayDealsPage extends AmazonAbstractPage {
    public AmazonTodayDealsPage(WebDriver driver) {
        super(driver);
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
