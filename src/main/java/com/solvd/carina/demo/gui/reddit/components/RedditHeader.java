package com.solvd.carina.demo.gui.reddit.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RedditHeader extends AbstractUIObject {

    @FindBy(xpath = "//*[@id='navbar-menu-button']")
    private ExtendedWebElement navigationButton;
    @FindBy(xpath = "//*[@aria-label='Home']")
    private ExtendedWebElement redditLogoButton;
    @FindBy(xpath = "//*[@placeholder='Search Reddit']")
    private ExtendedWebElement searchBarInputField;
    @FindBy(css = "a#advertise-button")
    private ExtendedWebElement advertiseButton;
    @FindBy(css = "a#header-action-item-chat-button")
    private ExtendedWebElement chatButton;
    @FindBy(css = "a#create-post")
    private ExtendedWebElement createButton;
    @FindBy(xpath = "//*[@icon-name='notification-outline']/../../..")
    private ExtendedWebElement notificationsButton;
    @FindBy(xpath = "//*[@id='expand-user-drawer-button']")
    private ExtendedWebElement profileButton;

    public RedditHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void typeSearchBar (String searchInput) {
        searchBarInputField.type(searchInput);
    }

    public void clickNavigationButton () {
        navigationButton.click();
    }

    public void clickRedditLogoButton () {
        redditLogoButton.click();
    }

    public void clickAdvertiseButton () {
        advertiseButton.click();
    }

    public void clickChatButton () {
        chatButton.click();
    }

    public void clickCreateButton () {
        createButton.click();
    }

    public void clickNotificationsButton () {
        notificationsButton.click();
    }

    public void clickProfileButton () {
        profileButton.click();
    }
}
