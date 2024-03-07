package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.automationExercise.components.AutomationHeader;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationLoginForm;
import com.solvd.carina.demo.gui.automationExercise.pages.AutomationAuthPage;
import com.solvd.carina.demo.gui.automationExercise.pages.AutomationHomePage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//https://www.automationexercise.com/
public class WebAutomationExerciseTest implements IAbstractTest {

    @Test(dataProvider = "loginData")
    public void loginTest (String email, String password) {
        AutomationAuthPage authPage = new AutomationAuthPage(getDriver());
        AutomationLoginForm loginForm = authPage.getLoginForm();

        getDriver().navigate().to("https://www.automationexercise.com/login");

        Assert.assertTrue(loginForm.isTitlePresent(), "Title not present");
        Assert.assertEquals(loginForm.getTitleText(), "Login to your account", "text title present not correct");

        loginForm.typeEmail(email);
        loginForm.typePassword(password);

        Assert.assertTrue(loginForm.isLoginButtonClickable(), "Login button not clickable");
        loginForm.clickLoginButton();

    }

    @DataProvider(name = "loginData")
    public Object [][] loginData () {
        return new Object[][] {
                {"testOne@gmail.com", "password"},
                {"testTwo@gmail.com", "password"}
        };
    }

}
