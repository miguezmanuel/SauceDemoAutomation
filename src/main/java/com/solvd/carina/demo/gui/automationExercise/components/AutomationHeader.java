package com.solvd.carina.demo.gui.automationExercise.components;

import com.solvd.carina.demo.gui.automationExercise.pages.AutomationAuthPage;
import com.solvd.carina.demo.gui.automationExercise.pages.AutomationCartPage;
import com.solvd.carina.demo.gui.automationExercise.pages.AutomationHomePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationHeader extends AbstractUIObject {

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    private ExtendedWebElement logoButton;
    @FindBy(xpath = "//i[@class='fa fa-home']/..")
    private ExtendedWebElement homeButton;
    @FindBy(xpath = "//i[@class='material-icons card_travel']/..")
    private ExtendedWebElement productsButton;
    @FindBy(xpath = "//div[@class='shop-menu pull-right']/descendant::a[@href='/view_cart']")
    private ExtendedWebElement cartButton;
    @FindBy(xpath = "//div[@class='shop-menu pull-right']/descendant::a[@href='/login']")
    private ExtendedWebElement signupAndLoginButton;
    @FindBy(xpath = "//div[@class='shop-menu pull-right']/descendant::a[@href='/test_cases']")
    private ExtendedWebElement testCasesButton;
    @FindBy(xpath = "//div[@class='shop-menu pull-right']/descendant::a[@href='/api_list']")
    private ExtendedWebElement apiTesting;
    @FindBy(xpath = "//div[@class='shop-menu pull-right']/descendant::a[contains(@href, 'https')]")
    private ExtendedWebElement videoTutorialsButton;
    @FindBy(xpath = "//div[@class='shop-menu pull-right']/descendant::a[@href='/contact_us']")
    private ExtendedWebElement contactUsButton;

    public AutomationHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isLogoButtonPresent () {
        return logoButton.isPresent();
    }

    public AutomationHomePage clickLogoButton () {
        logoButton.click();
        return new AutomationHomePage(getDriver());
    }

    public AutomationHomePage clickHomeButton () {
        homeButton.click();
        return new AutomationHomePage(getDriver());
    }

    public void clickProductsButton () {
        productsButton.click();
    }

    public AutomationCartPage clickCartButton () {
        cartButton.click();
        return new AutomationCartPage(getDriver());
    }

    public AutomationAuthPage clickSignupAndLoginButton () {
        signupAndLoginButton.click();
        return new AutomationAuthPage(getDriver());
    }

    public void clickTestCasesButton () {
        testCasesButton.click();
    }

    public void clickApiTestingButton () {
        apiTesting.click();
    }

    public void clickVideoTutorialsButton () {
        videoTutorialsButton.click();
    }

    public void clickContactUsButton () {
        contactUsButton.click();
    }

}
