package com.solvd.carina.demo.gui.swaglabs.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsLoginForm extends AbstractUIObject {

    @FindBy(xpath = "//*[@class='login_logo']")
    public ExtendedWebElement titleText;
    @FindBy(xpath = "//*[@placeholder='Username']")
    private ExtendedWebElement usernameInputField;
    @FindBy(xpath = "//*[@placeholder='Password']")
    private ExtendedWebElement passwordInputField;
    @FindBy(xpath = "//*[@placeholder='error']")
    private ExtendedWebElement errorLoginMessage;

    public SwagLabsLoginForm(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isTitlePresent () {
        return titleText.isPresent();
    }

    public boolean isErrorPresent () {
        return errorLoginMessage.isPresent();
    }

    public void typeUsernameInputField (String username) {
        usernameInputField.type(username);
    }

    public void typePasswordInputField (String password) {
        passwordInputField.type(password);
    }

}
