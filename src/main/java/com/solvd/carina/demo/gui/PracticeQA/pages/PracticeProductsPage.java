package com.solvd.carina.demo.gui.PracticeQA.pages;

import com.solvd.carina.demo.gui.PracticeQA.common.PracticeBasePage;
import com.solvd.carina.demo.gui.PracticeQA.components.PracticeCartItemsContainer;
import com.solvd.carina.demo.gui.PracticeQA.components.PracticeItemsContainer;
import org.openqa.selenium.WebDriver;

public class PracticeProductsPage extends PracticeBasePage {
    public PracticeProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public PracticeItemsContainer getItemsContainer() {
        return super.getItemsContainer();
    }

    @Override
    public PracticeCartItemsContainer getCartItemsContainer() {
        return super.getCartItemsContainer();
    }
}
