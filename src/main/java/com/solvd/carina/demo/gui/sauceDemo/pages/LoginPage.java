package com.solvd.carina.demo.gui.sauceDemo.pages;

import com.solvd.carina.demo.gui.sauceDemo.common.BasePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private ExtendedWebElement usernameInput;

    @FindBy(id = "password")
    private ExtendedWebElement passwordInput;

    @FindBy(id = "login-button")
    private ExtendedWebElement loginButton;

    @FindBy(css = "h3[data-test='error']")
    private ExtendedWebElement errorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        usernameInput.type(username);
        passwordInput.type(password);
        loginButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public boolean isLoginPageVisible() {
        return usernameInput.isVisible();
    }
}

