package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.swaglabs.components.SwagLabsLoginForm;
import com.solvd.carina.demo.gui.swaglabs.pages.SwagLabsLoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebSwagLabsTest implements IAbstractTest {

    @Test
    public void loginTest () {
        SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(getDriver());
        SwagLabsLoginForm swagLabsLoginForm = swagLabsLoginPage.getSwagLabsLoginForm();

        swagLabsLoginPage.open();
        Assert.assertTrue(swagLabsLoginPage.isTitlePresent());

        swagLabsLoginForm.typeUsernameInputField("standard_user");
        swagLabsLoginForm.typePasswordInputField("secret_sauce");

        Assert.assertTrue(swagLabsLoginForm.isLoginButtonClickable(), "Login button is not clickable");
        swagLabsLoginForm.clickLoginButton();
    }

    @Test
    public void checkLoginErrorMessageTest () {
        SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(getDriver());
        SwagLabsLoginForm swagLabsLoginForm = swagLabsLoginPage.getSwagLabsLoginForm();

        swagLabsLoginPage.open();

        swagLabsLoginForm.typeUsernameInputField("error");
        swagLabsLoginForm.typePasswordInputField("error");
        swagLabsLoginForm.clickLoginButton();

        Assert.assertTrue(swagLabsLoginForm.isErrorPresent(), "Error is not shown");
        Assert.assertEquals(swagLabsLoginForm.returnErrorMessage(), "Epic sadface: Username and password do not match any user in this service");

    }
}
