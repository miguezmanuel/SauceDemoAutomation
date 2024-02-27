package com.solvd.carina.demo.gui.swaglabs.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsLoginPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='login_logo']")
    public ExtendedWebElement titleText;
    @FindBy(xpath = "//*[@placeholder='Username']")
    private ExtendedWebElement usernameInputField;
    @FindBy(xpath = "//*[@placeholder='Password']")
    private ExtendedWebElement passwordInputField;

    public SwagLabsLoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTitlePresent () {
        return titleText.isPresent();
    }

    public void typeUsernameInputField (String username) {
        usernameInputField.type(username);
    }

    public void typePasswordInputField (String password) {
        passwordInputField.type(password);
    }
}
