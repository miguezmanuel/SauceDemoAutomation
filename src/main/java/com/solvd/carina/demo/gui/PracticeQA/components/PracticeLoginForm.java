package com.solvd.carina.demo.gui.PracticeQA.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PracticeLoginForm extends AbstractUIObject {

    @FindBy(xpath = "//h2[text()='Login - Shop']")
    private ExtendedWebElement loginTitle;
    @FindBy(xpath = "//input[@placeholder='Enter email']")
    private ExtendedWebElement emailInputField;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private ExtendedWebElement passwordInputField;
    @FindBy(xpath = "//button[@id='submitLoginBtn']")
    private ExtendedWebElement submitButton;
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private ExtendedWebElement badCredentialsAlert;

    public PracticeLoginForm(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isLoginTitlePresent () {
        return loginTitle.isPresent();
    }

    public void typeEmailInputField (String emailInfo) {
        emailInputField.type(emailInfo);
    }

    public void typePasswordInputField (String passwordInfo) {
        passwordInputField.type(passwordInfo);
    }

    public boolean isSubmitButtonClickable () {
        return submitButton.isClickable();
    }

    public void clickSubmitButton () {
        submitButton.click();
    }

    public boolean isBadCredentialsPresent () {
        return badCredentialsAlert.isPresent();
    }

    public String getBadCredentialsAlert () {
        return badCredentialsAlert.getText();
    }
}
