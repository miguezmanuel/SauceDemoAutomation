package com.solvd.carina.demo.gui.sauceDemo.pages;

import com.solvd.carina.demo.gui.sauceDemo.common.SauceBasePage;
import com.solvd.carina.demo.gui.sauceDemo.components.SauceFooter;
import com.solvd.carina.demo.gui.sauceDemo.components.SauceHeader;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SauceCartPage extends SauceBasePage {

    @FindBy(css = ".cart_item")
    private List<ExtendedWebElement> cartItems;

    @FindBy(css = ".checkout_button")
    private ExtendedWebElement checkoutButton;

    @FindBy(xpath = "//button[contains(text(), 'Remove')]")
    private List<ExtendedWebElement> removeButtons;

    public SauceCartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductInCart(String productName) {
        for (ExtendedWebElement item : cartItems) {
            if (item.getText().contains(productName)) {
                return true;
            }
        }
        return false;
    }

    public void removeProductFromCart(String productName) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getText().contains(productName)) {
                removeButtons.get(i).click();
                break;
            }
        }
    }

    public void clickCheckout() {
        checkoutButton.click();
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