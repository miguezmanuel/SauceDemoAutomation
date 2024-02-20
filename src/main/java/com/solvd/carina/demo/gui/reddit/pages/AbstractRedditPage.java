package com.solvd.carina.demo.gui.reddit.pages;

import com.solvd.carina.demo.gui.reddit.components.RedditHeader;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AbstractRedditPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='v2 bg-neutral-background px-md l:px-lg pointer-events-auto']")
    private RedditHeader redditHeader;

    public AbstractRedditPage(WebDriver driver) {
        super(driver);
    }

    public RedditHeader getRedditHeader() {
        return redditHeader;
    }
}
