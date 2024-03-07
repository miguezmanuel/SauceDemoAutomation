package com.solvd.carina.demo.gui.automationExercise.pages;

import com.solvd.carina.demo.gui.automationExercise.common.AutomationBasePage;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationAddedToCartAlert;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationHeader;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationProductsContainer;
import org.openqa.selenium.WebDriver;

public class AutomationProductsPage extends AutomationBasePage {
    public AutomationProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AutomationProductsContainer getProductsContainer() {
        return super.getProductsContainer();
    }

    @Override
    public AutomationHeader getHeader() {
        return super.getHeader();
    }

    @Override
    public AutomationAddedToCartAlert getAddedToCartAlert() {
        return super.getAddedToCartAlert();
    }
}
