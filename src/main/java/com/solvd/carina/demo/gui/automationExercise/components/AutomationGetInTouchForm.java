package com.solvd.carina.demo.gui.automationExercise.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationGetInTouchForm extends AbstractUIObject {

    @FindBy(xpath = "//input[@placeholder='Name']")
    private ExtendedWebElement nameInputField;
    @FindBy(xpath = "//input[@placeholder='Email']")
    private ExtendedWebElement emailInputField;
    @FindBy(xpath = "//input[@placeholder='Subject']")
    private ExtendedWebElement subjectInputField;
    @FindBy(xpath = "//textarea[@name='message']")
    private ExtendedWebElement messageInputField;
    @FindBy(xpath = "//input[@type='file']")
    private ExtendedWebElement chooseFileButton;
    @FindBy(xpath = "//input[@type='submit']")
    private ExtendedWebElement submitButton;

    public AutomationGetInTouchForm(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void typeNameInputField (String name) {
        nameInputField.type(name);
    }

    public void typeEmailInputField (String email) {
        emailInputField.type(email);
    }

    public void typeSubjectInputField (String subject) {
        subjectInputField.type(subject);
    }

    public void typeMessageInputField (String message) {
        messageInputField.type(message);
    }

    public void clickChooseFileButton () {
        chooseFileButton.click();
    }

    public void clickSubmitButton () {
        submitButton.click();
    }
}
