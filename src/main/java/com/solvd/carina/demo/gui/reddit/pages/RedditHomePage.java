package com.solvd.carina.demo.gui.reddit.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RedditHomePage extends AbstractPage {

    @FindBy()
    private ExtendedWebElement profileButton;
    @FindBy()
    private ExtendedWebElement redditLogo;
    @FindBy()
    private ExtendedWebElement searchBar;
    @FindBy()
    private ExtendedWebElement chatButton;
    @FindBy()
    private ExtendedWebElement createButton;
    @FindBy()
    private ExtendedWebElement notificationsButton;
    @FindBy()
    private ExtendedWebElement navigationBarButton;
    @FindBy()
    private ExtendedWebElement orderByButton;
    @FindBy()
    private ExtendedWebElement changePostViewButton;

    public RedditHomePage(WebDriver driver) {
        super(driver);
    }
}
