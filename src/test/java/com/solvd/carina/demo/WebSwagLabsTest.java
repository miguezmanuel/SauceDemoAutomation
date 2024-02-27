package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.swaglabs.pages.SwagLabsLoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebSwagLabsTest implements IAbstractTest {

    @Test
    public void loginTest () {
        SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(getDriver());

        swagLabsLoginPage.open();
        Assert.assertTrue(swagLabsLoginPage.isTitlePresent());

        swagLabsLoginPage.typeUsernameInputField("standard_user");
        swagLabsLoginPage.typePasswordInputField("secret_sauce");
    }
}
