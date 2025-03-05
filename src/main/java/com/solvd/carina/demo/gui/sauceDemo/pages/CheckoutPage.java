package com.solvd.carina.demo.gui.sauceDemo.pages;

import com.solvd.carina.demo.gui.sauceDemo.common.BasePage;
import com.solvd.carina.demo.gui.sauceDemo.components.Footer;
import com.solvd.carina.demo.gui.sauceDemo.components.Header;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(id = "first-name")
    private ExtendedWebElement firstNameInput;

    @FindBy(id = "last-name")
    private ExtendedWebElement lastNameInput;

    @FindBy(id = "postal-code")
    private ExtendedWebElement zipInput;

    @FindBy(css = "input.btn_primary.cart_button")
    private ExtendedWebElement continueButton;

    @FindBy(css = "a.btn_action.cart_button")
    private ExtendedWebElement finishButton;

    @FindBy(css = ".complete-header")
    private ExtendedWebElement orderSuccessMessage;

    @FindBy(css = "[data-test='error']")
    private ExtendedWebElement errorMessage;

    public CheckoutPage(WebDriver driver) {
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
    public Header getHeader() {
        return super.getHeader();
    }

    @Override
    public Footer getFooter() {
        return super.getFooter();
    }
}
