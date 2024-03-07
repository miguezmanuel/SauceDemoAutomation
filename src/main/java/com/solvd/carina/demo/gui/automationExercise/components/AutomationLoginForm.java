package com.solvd.carina.demo.gui.automationExercise.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationLoginForm extends AbstractUIObject {

    @FindBy(xpath = "//h2[text()='Login to your account']")
    private ExtendedWebElement titleText;
    @FindBy(xpath = "//form[@action='/login']//input[@type='email']")
    private ExtendedWebElement emailInputField;
    @FindBy(xpath = "//form[@action='/login']//input[@type='password']")
    private ExtendedWebElement passwordInputField;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    private ExtendedWebElement loginButton;
    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    private ExtendedWebElement errorLoginMessage;

    public AutomationLoginForm(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isTitlePresent () {
        return titleText.isPresent();
    }

    public String getTitleText () {
        return titleText.getText();
    }

    public void typeEmail (String email) {
        emailInputField.type(email);
    }

    public void typePassword (String password) {
        passwordInputField.type(password);
    }

    public boolean isLoginButtonClickable () {
        return loginButton.isClickable();
    }

    public void clickLoginButton () {
        loginButton.click();
    }
}
