package com.solvd.carina.demo.gui.sauceDemo.pages;

import com.solvd.carina.demo.gui.sauceDemo.common.SauceBasePage;
import com.solvd.carina.demo.gui.sauceDemo.components.SauceFooter;
import com.solvd.carina.demo.gui.sauceDemo.components.SauceHeader;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SauceCheckoutPage extends SauceBasePage {

    @FindBy(id = "first-name")
    private ExtendedWebElement firstNameInput;

    @FindBy(id = "last-name")
    private ExtendedWebElement lastNameInput;

    @FindBy(id = "postal-code")
    private ExtendedWebElement zipInput;

    @FindBy(id = "continue")
    private ExtendedWebElement continueButton;

    @FindBy(id = "finish")
    private ExtendedWebElement finishButton;

    @FindBy(css = ".complete-header")
    private ExtendedWebElement orderSuccessMessage;

    @FindBy(css = "[data-test='error']")
    private ExtendedWebElement errorMessage;

    public SauceCheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void fillCheckoutInfo(String firstName, String lastName, String zip) {
        firstNameInput.type(firstName);
        lastNameInput.type(lastName);
        zipInput.type(zip);
        continueButton.click();
    }

    public void completeOrder() {
        finishButton.click();
    }

    public boolean isOrderSuccessful() {
        return orderSuccessMessage.isPresent();
    }

    public boolean isErrorDisplayed() {
        return errorMessage.isPresent();
    }

    @Override
    public SauceHeader getHeader() {
        return super.getHeader();
    }

    @Override
    public SauceFooter getFooter() {
        return super.getFooter();
    }
}
