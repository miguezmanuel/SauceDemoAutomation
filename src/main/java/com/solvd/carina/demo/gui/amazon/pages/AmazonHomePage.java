package com.solvd.carina.demo.gui.amazon.pages;

import com.solvd.carina.demo.gui.amazon.components.AmazonHeader;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage extends AbstractPage {

    private AmazonHeader amazonHeader;

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public AmazonHeader getAmazonHeader() {
        return amazonHeader;
    }
}
