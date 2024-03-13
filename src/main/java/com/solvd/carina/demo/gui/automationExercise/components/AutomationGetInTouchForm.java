package com.solvd.carina.demo.gui.automationExercise.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationGetInTouchForm extends AbstractUIObject {

    @FindBy(xpath = "")
    private ExtendedWebElement nameInputField;
    @FindBy(xpath = "")
    private ExtendedWebElement emailInputField;
    @FindBy(xpath = "")
    private ExtendedWebElement subjectInputField;
    @FindBy(xpath = "")
    private ExtendedWebElement messageInputField;
    @FindBy(xpath = "")
    private ExtendedWebElement chooseFileButton;
    @FindBy(xpath = "")
    private ExtendedWebElement submitButton;

    public AutomationGetInTouchForm(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
