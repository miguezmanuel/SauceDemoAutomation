package com.solvd.carina.demo.gui.amazon.pages;

import com.solvd.carina.demo.gui.amazon.components.AmazonChoseLocationCard;
import com.solvd.carina.demo.gui.amazon.components.AmazonHeader;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends AbstractPage {

    @FindBy(css = "div#nav-belt")
    private AmazonHeader amazonHeader;

    @FindBy(css = "div#Condo")
    private AmazonChoseLocationCard amazonChoseLocationCard;

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public AmazonHeader getAmazonHeader() {
        return amazonHeader;
    }

    public AmazonChoseLocationCard getAmazonChoseLocationCard() {
        return amazonChoseLocationCard;
    }
}
