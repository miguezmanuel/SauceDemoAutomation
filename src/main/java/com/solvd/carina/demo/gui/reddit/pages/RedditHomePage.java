package com.solvd.carina.demo.gui.reddit.pages;

import com.solvd.carina.demo.gui.reddit.components.RedditHeader;
import com.solvd.carina.demo.gui.reddit.components.RedditLoginCard;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RedditHomePage extends AbstractRedditPage {

    @FindBy(xpath = "//*[@class='h-header-large flex m:grid m:grid-cols-14 l:grid-cols-16 xl:grid-cols-18 s:gap-md border-b-sm border-t-0 border-l-0 border-r-0 border-solid border-neutral-border-weak items-center m:px-xs']")
    private RedditHeader redditHeader;

    @FindBy(xpath = "//*[@name='username']/../../../.")
    private RedditLoginCard redditLoginCard;

    public RedditHomePage(WebDriver driver) {
        super(driver);
    }

    public RedditHeader getRedditHeader() {
        return redditHeader;
    }

    public RedditLoginCard getRedditLoginCard() {
        return redditLoginCard;
    }
}
