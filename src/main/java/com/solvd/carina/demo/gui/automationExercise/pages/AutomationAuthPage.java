package com.solvd.carina.demo.gui.automationExercise.pages;

import com.solvd.carina.demo.gui.automationExercise.common.AutomationBasePage;
import com.solvd.carina.demo.gui.automationExercise.components.LoginForm;
import com.solvd.carina.demo.gui.automationExercise.components.SignUpForm;
import org.openqa.selenium.WebDriver;

public class AutomationAuthPage extends AutomationBasePage {
    public AutomationAuthPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginForm getLoginForm() {
        return super.getLoginForm();
    }

    @Override
    public SignUpForm getSignUpForm() {
        return super.getSignUpForm();
    }
}
