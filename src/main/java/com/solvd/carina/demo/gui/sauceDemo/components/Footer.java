package com.solvd.carina.demo.gui.sauceDemo.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class Footer extends AbstractUIObject {

    @FindBy(className = "social_twitter")
    private ExtendedWebElement twitterLink;

    @FindBy(className = "social_facebook")
    private ExtendedWebElement facebookLink;

    @FindBy(className = "social_linkedin")
    private ExtendedWebElement linkedinLink;

    protected Footer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void openTwitter() {
        twitterLink.click();
    }

    public void openFacebook() {
        facebookLink.click();
    }

    public void openLinkedIn() {
        linkedinLink.click();
    }

    public boolean isTwitterOpened() {
        return isSocialMediaOpened("twitter.com");
    }

    public boolean isFacebookOpened() {
        return isSocialMediaOpened("facebook.com");
    }

    public boolean isLinkedInOpened() {
        return isSocialMediaOpened("linkedin.com");
    }

    private boolean isSocialMediaOpened(String expectedUrlPart) {
        Set<String> windowHandles = getDriver().getWindowHandles();
        for (String window : windowHandles) {
            getDriver().switchTo().window(window);
            if (getDriver().getCurrentUrl().contains(expectedUrlPart)) {
                return true;
            }
        }
        return false;
    }
}