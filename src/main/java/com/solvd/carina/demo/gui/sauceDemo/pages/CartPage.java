package com.solvd.carina.demo.gui.sauceDemo.pages;

import com.solvd.carina.demo.gui.sauceDemo.common.BasePage;
import com.solvd.carina.demo.gui.sauceDemo.components.Footer;
import com.solvd.carina.demo.gui.sauceDemo.components.Header;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".cart_item_label .inventory_item_name")
    private List<ExtendedWebElement> cartItems;

    @FindBy(css = "a.btn_action.checkout_button")
    private ExtendedWebElement checkoutButton;

    @FindBy(css = "button.btn_secondary.cart_button")
    private List<ExtendedWebElement> removeButtons;

    public CartPage(WebDriver driver) {
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
    public Header getHeader() {
        return super.getHeader();
    }

    @Override
    public Footer getFooter() {
        return super.getFooter();
    }
}