package com.solvd.carina.demo.gui.PracticeQA.common;

import com.solvd.carina.demo.gui.PracticeQA.components.PracticeCartItemsContainer;
import com.solvd.carina.demo.gui.PracticeQA.components.PracticeItemsContainer;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PracticeBasePage extends AbstractPage {

    @FindBy(xpath = "//div[@class='shop-items']")
    private PracticeItemsContainer itemsContainer;
    @FindBy(xpath = "//div[@class='cart-items']")
    private PracticeCartItemsContainer cartItemsContainer;

    public PracticeBasePage(WebDriver driver) {
        super(driver);
    }

    public PracticeItemsContainer getItemsContainer() {
        return itemsContainer;
    }

    public PracticeCartItemsContainer getCartItemsContainer() {
        return cartItemsContainer;
    }
}
