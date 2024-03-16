package com.solvd.carina.demo.gui.automationExercise.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationApiTestingContainer extends AbstractUIObject {

    @FindBy(xpath = "")
    private ExtendedWebElement title;
    @FindBy(xpath = "")
    private ExtendedWebElement taskList;
    @FindBy(xpath = "")
    private ExtendedWebElement task;
    @FindBy(xpath = "")
    private ExtendedWebElement adviseText;

    public AutomationApiTestingContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void getTaskList () {

    }

    public void isTitlePresent () {

    }

    public void getTaskByName () {

    }

    public void clickTask () {

    }

    public void isAdviseTextPresent () {

    }


}
