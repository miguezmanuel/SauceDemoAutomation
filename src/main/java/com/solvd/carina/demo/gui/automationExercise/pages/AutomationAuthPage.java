package com.solvd.carina.demo.gui.automationExercise.pages;

import com.solvd.carina.demo.gui.automationExercise.common.AutomationBasePage;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationLoginForm;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationSignUpForm;
import org.openqa.selenium.WebDriver;

public class AutomationAuthPage extends AutomationBasePage {
    public AutomationAuthPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AutomationLoginForm getLoginForm() {
        return super.getLoginForm();
    }

    @Override
    public AutomationSignUpForm getSignUpForm() {
        return super.getSignUpForm();
    }
}
