package com.solvd.carina.demo.gui.automationExercise.pages;

import com.solvd.carina.demo.gui.automationExercise.common.AutomationBasePage;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationCartProductsTable;
import org.openqa.selenium.WebDriver;

public class AutomationCartPage extends AutomationBasePage {
    public AutomationCartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AutomationCartProductsTable getCartProductsTable() {
        return super.getCartProductsTable();
    }
}
