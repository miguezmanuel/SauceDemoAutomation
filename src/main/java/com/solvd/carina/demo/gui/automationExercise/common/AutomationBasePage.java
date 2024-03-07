package com.solvd.carina.demo.gui.automationExercise.common;

import com.solvd.carina.demo.gui.automationExercise.components.LoginForm;
import com.solvd.carina.demo.gui.automationExercise.components.SignUpForm;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationBasePage extends AbstractPage {

    @FindBy(xpath = "//div[@class='login-form']")
    private LoginForm loginForm;
    @FindBy(xpath = "//div[@class='signup-form']")
    private SignUpForm signUpForm;

    public AutomationBasePage(WebDriver driver) {
        super(driver);
    }

    public LoginForm getLoginForm() {
        return loginForm;
    }

    public SignUpForm getSignUpForm() {
        return signUpForm;
    }
}
