package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.swaglabs.components.*;
import com.solvd.carina.demo.gui.swaglabs.pages.SwagLabsCartPage;
import com.solvd.carina.demo.gui.swaglabs.pages.SwagLabsInventoryPage;
import com.solvd.carina.demo.gui.swaglabs.pages.SwagLabsLoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.webdriver.DriverHelper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebSwagLabsTest implements IAbstractTest {

    @Test
    public void loginTest () {
        SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(getDriver());
        SwagLabsLoginForm swagLabsLoginForm = swagLabsLoginPage.getLoginForm();

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
        SwagLabsLoginForm swagLabsLoginForm = swagLabsLoginPage.getLoginForm();

        swagLabsLoginPage.open();

        swagLabsLoginForm.typeUsernameInputField("error");
        swagLabsLoginForm.typePasswordInputField("error");
        swagLabsLoginForm.clickLoginButton();

        Assert.assertTrue(swagLabsLoginForm.isErrorPresent(), "Error is not shown");
        Assert.assertEquals(swagLabsLoginForm.errorMessageText(), "Epic sadface: Username and password do not match any user in this service");

    }

    @Test
    public void goToItemPage () {
        SwagLabsLoginPage loginPage = new SwagLabsLoginPage(getDriver());
        SwagLabsLoginForm loginForm = loginPage.getLoginForm();
        SwagLabsInventoryPage inventoryPage = new SwagLabsInventoryPage(getDriver());
        SwagLabsInventoryContainer inventoryContainer = inventoryPage.getInventoryContainer();

        loginPage.open();
        loginForm.login();

        inventoryContainer.clickItemTitle("Sauce Labs Backpack");
    }

    @Test
    public void getItemImageUrlTest () {
        SwagLabsLoginPage loginPage = new SwagLabsLoginPage(getDriver());
        SwagLabsLoginForm loginForm = loginPage.getLoginForm();
        SwagLabsInventoryPage inventoryPage = new SwagLabsInventoryPage(getDriver());
        SwagLabsInventoryContainer inventoryContainer = inventoryPage.getInventoryContainer();
        DriverHelper driverHelper = new DriverHelper(getDriver());

        loginPage.open();
        loginForm.login();

        Assert.assertEquals(inventoryContainer
                .getImageUrl("Sauce Labs Backpack"), driverHelper.getPageURL() + "static/media/sauce-backpack-1200x1500.0a0b85a3.jpg");
    }

    @Test
    public void getItemDescriptionAndTitleTest () {
        SwagLabsLoginPage loginPage = new SwagLabsLoginPage(getDriver());
        SwagLabsLoginForm loginForm = loginPage.getLoginForm();
        SwagLabsInventoryPage inventoryPage = new SwagLabsInventoryPage(getDriver());
        SwagLabsInventoryContainer inventoryContainer = inventoryPage.getInventoryContainer();
        DriverHelper driverHelper = new DriverHelper(getDriver());

        loginPage.open();
        loginForm.login();

        String elementName = "Sauce Labs Backpack";

        Assert.assertEquals(inventoryContainer.getItemTitle(elementName),
                driverHelper.findExtendedWebElement(By.xpath("//div[contains(text(), 'Sauce Labs Backpack')]")).getText());

        Assert.assertEquals(inventoryContainer.getDescription(elementName),
                driverHelper.findExtendedWebElement(By.xpath("//div[contains(text(), 'Sly Pack')]")).getText());
    }

    @Test
    public void goToAboutPageTest () {
        SwagLabsLoginPage loginPage = new SwagLabsLoginPage(getDriver());
        SwagLabsLoginForm loginForm = loginPage.getLoginForm();
        SwagLabsInventoryPage inventoryPage = new SwagLabsInventoryPage(getDriver());
        SwagLabsHeader header = inventoryPage.getHeader();
        SwagLabsSideMenu sideMenu = inventoryPage.getSideMenu();

        loginPage.open();
        loginForm.login();
        Assert.assertTrue(header.isTitlePresent(), "title not present, login might have failed");

        header.clickSideMenuButton();
        sideMenu.clickAboutButton();
        Assert.assertFalse(header.isTitlePresent(), "title present, about button or side menu might have failed");

    }

    @Test
    public void AddAndCheckItemTitlesList () {
        SwagLabsLoginPage loginPage = new SwagLabsLoginPage(getDriver());
        SwagLabsLoginForm loginForm = loginPage.getLoginForm();
        SwagLabsInventoryPage inventoryPage = new SwagLabsInventoryPage(getDriver());
        SwagLabsHeader header = inventoryPage.getHeader();
        SwagLabsInventoryContainer inventoryContainer = inventoryPage.getInventoryContainer();
        SwagLabsCartPage cartPage = new SwagLabsCartPage(getDriver());
        SwagLabsCartList cartList = cartPage.getCartList();

        loginPage.open();
        loginForm.login();
        String elementName = "Sauce Labs Backpack";
        inventoryContainer.clickAddToCartButton(elementName);

        header.clickCartButton();
        List<String> list = cartList.getTitlesList();

        Assert.assertEquals(list.get(0), elementName);

    }

}
