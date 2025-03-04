package com.solvd.carina.demo.gui.sauceDemo.components;

import com.solvd.carina.demo.gui.sauceDemo.common.SauceBasePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class SauceFooter extends AbstractUIObject {

    @FindBy(css = "a[href='https://twitter.com/saucelabs']")
    private ExtendedWebElement twitterLink;

    @FindBy(css = "a[href='https://www.facebook.com/saucelabs']")
    private ExtendedWebElement facebookLink;

    @FindBy(css = "a[href='https://www.linkedin.com/company/sauce-labs/']")
    private ExtendedWebElement linkedinLink;

    protected SauceFooter(WebDriver driver, SearchContext searchContext) {
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