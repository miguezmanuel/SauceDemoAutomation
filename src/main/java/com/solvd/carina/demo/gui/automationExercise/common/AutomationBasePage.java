package com.solvd.carina.demo.gui.automationExercise.common;

import com.solvd.carina.demo.gui.automationExercise.components.AutomationHeader;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationLoginForm;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationSignUpForm;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationBasePage extends AbstractPage {

    @FindBy(xpath = "//div[@class='login-form']")
    private AutomationLoginForm loginForm;
    @FindBy(xpath = "//div[@class='signup-form']")
    private AutomationSignUpForm signUpForm;
    @FindBy(xpath = "//div[@class='logo pull-left']/ancestor::div[@class='row']")
    private AutomationHeader header;

    public AutomationBasePage(WebDriver driver) {
        super(driver);
    }

    public AutomationLoginForm getLoginForm() {
        return loginForm;
    }

    public AutomationSignUpForm getSignUpForm() {
        return signUpForm;
    }

    public AutomationHeader getHeader() {
        return header;
    }
}
