package com.solvd.carina.demo.gui.reddit.components;

import com.solvd.carina.demo.gui.reddit.pages.RedditHomePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RedditLoginCard extends AbstractUIObject {

    @FindBy(css = "div.haAclf")
    private ExtendedWebElement googleLoginButton;
    @FindBy(xpath = "//*[@aria-label='Sign in with Apple']")
    private ExtendedWebElement appleLoginButton;
    @FindBy(css = "input#login-username")
    private ExtendedWebElement usernameInputField;
    @FindBy(css = "input#login-password")
    private ExtendedWebElement passwordInputField;
    @FindBy(css = "div.nsm7Bb-HzV7m-LgbsSe-MJoBVe")
    private ExtendedWebElement loginButton;

    public RedditLoginCard(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isGoogleLoginButtonPresent () {
        return googleLoginButton.isPresent();
    }

    public void clickGoogleLoginButton () {
        googleLoginButton.click();
    }

    public void clickAppleLoginButton () {
        appleLoginButton.click();
    }

    public boolean isUsernamePresent () {
        return usernameInputField.isPresent();
    }

    public void typeUsername (String usernameInput) {
        usernameInputField.type(usernameInput);
    }

    public void typePassword (String passwordInput) {
        passwordInputField.type(passwordInput);
    }

    public boolean isLoginButtonClickable () {
        return loginButton.isClickable();
    }

    public RedditHomePage clickLoginButton () {
        loginButton.click();
        return new RedditHomePage(getDriver());
    }
}
