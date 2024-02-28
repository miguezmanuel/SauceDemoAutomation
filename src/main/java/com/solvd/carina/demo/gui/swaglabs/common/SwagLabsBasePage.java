package com.solvd.carina.demo.gui.swaglabs.common;

import com.solvd.carina.demo.gui.swaglabs.components.SwagLabsLoginForm;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsBasePage extends AbstractPage {

    @FindBy(xpath = "//div[@class='login_wrapper-inner']")
    private SwagLabsLoginForm swagLabsLoginForm;

    public SwagLabsBasePage(WebDriver driver) {
        super(driver);
    }

    public SwagLabsLoginForm getSwagLabsLoginForm() {
        return swagLabsLoginForm;
    }
}
