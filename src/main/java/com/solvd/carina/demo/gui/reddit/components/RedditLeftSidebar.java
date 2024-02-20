package com.solvd.carina.demo.gui.reddit.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RedditLeftSidebar extends AbstractUIObject {

    @FindBy(xpath = "//*[@id='home-posts']/a")
    private ExtendedWebElement homeButton;
    @FindBy()
    private ExtendedWebElement popularButton;
    @FindBy()
    private ExtendedWebElement allButton;
    @FindBy()
    private ExtendedWebElement recentMenu;
    @FindBy()
    private ExtendedWebElement communitiesMenu;
    @FindBy()
    private ExtendedWebElement resourcesMenu;

    public RedditLeftSidebar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
