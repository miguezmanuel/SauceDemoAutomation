package com.solvd.carina.demo.gui.automationExercise.pages;

import com.solvd.carina.demo.gui.automationExercise.common.AutomationBasePage;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationApiTestingContainer;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationHeader;
import org.openqa.selenium.WebDriver;

public class AutomationApiTestingPage extends AutomationBasePage {

    public AutomationApiTestingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AutomationApiTestingContainer getTestingContainer() {
        return super.getTestingContainer();
    }

    @Override
    public AutomationHeader getHeader() {
        return super.getHeader();
    }
}
