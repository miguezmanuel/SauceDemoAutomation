package com.solvd.carina.demo.gui.swaglabs.pages;

import com.solvd.carina.demo.gui.swaglabs.common.SwagLabsBasePage;
import com.solvd.carina.demo.gui.swaglabs.components.SwagLabsLoginForm;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsLoginPage extends SwagLabsBasePage {

    @FindBy(xpath = "//*[@class='login_logo']")
    public ExtendedWebElement titleText;

    public SwagLabsLoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTitlePresent () {
        return titleText.isPresent();
    }

    @Override
    public SwagLabsLoginForm getSwagLabsLoginForm() {
        return super.getSwagLabsLoginForm();
    }
}
