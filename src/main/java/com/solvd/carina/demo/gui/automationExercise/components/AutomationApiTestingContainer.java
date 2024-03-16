package com.solvd.carina.demo.gui.automationExercise.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationApiTestingContainer extends AbstractUIObject {

    @FindBy(xpath = "//h2[@class='title text-center']")
    private ExtendedWebElement title;
    @FindBy(xpath = "//h4[@class='panel-title']")
    private ExtendedWebElement taskList;
    @FindBy(xpath = "//h4[@class='panel-title'][text()='%s']")
    private ExtendedWebElement task;
    @FindBy(xpath = "//h5")
    private ExtendedWebElement adviseText;

    public AutomationApiTestingContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void getTaskList () {

    }

    public boolean isTitlePresent () {
        return title.isPresent();
    }

    public void getTaskByName () {

    }

    public void clickTask () {

    }

    public void isAdviseTextPresent () {

    }


}
