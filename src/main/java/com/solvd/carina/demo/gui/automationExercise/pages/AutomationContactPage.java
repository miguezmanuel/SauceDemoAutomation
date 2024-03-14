package com.solvd.carina.demo.gui.automationExercise.pages;

import com.solvd.carina.demo.gui.automationExercise.common.AutomationBasePage;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationGetInTouchForm;
import com.solvd.carina.demo.gui.automationExercise.components.AutomationHeader;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationContactPage extends AutomationBasePage {

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    private ExtendedWebElement successContactFormSubmitted;

    public AutomationContactPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AutomationGetInTouchForm getGetInTouchForm() {
        return super.getGetInTouchForm();
    }

    @Override
    public AutomationHeader getHeader() {
        return super.getHeader();
    }

    public boolean isSuccessMessageVisible () {
        return successContactFormSubmitted.isVisible();
    }

}
