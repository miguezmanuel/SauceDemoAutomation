package com.solvd.carina.demo.gui.swaglabs.common;

import com.solvd.carina.demo.gui.swaglabs.components.SwagLabsHeader;
import com.solvd.carina.demo.gui.swaglabs.components.SwagLabsLoginForm;
import com.solvd.carina.demo.gui.swaglabs.components.SwagLabsSecondHeader;
import com.solvd.carina.demo.gui.swaglabs.components.SwagLabsSideMenu;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsBasePage extends AbstractPage {

    @FindBy(xpath = "//div[@class='login_wrapper-inner']")
    private SwagLabsLoginForm LoginForm;
    @FindBy(xpath = "//div[@class='header_label']")
    private SwagLabsHeader Header;
    @FindBy(xpath = "//div[@class='header_secondary_container']")
    private SwagLabsSecondHeader SecondHeader;
    @FindBy(xpath = "//div[@class='bm-menu']")
    private SwagLabsSideMenu sideMenu;

    public SwagLabsBasePage(WebDriver driver) {
        super(driver);
    }

    public SwagLabsLoginForm getLoginForm() {
        return LoginForm;
    }

    public SwagLabsHeader getHeader() {
        return Header;
    }

    public SwagLabsSecondHeader getSecondHeader() {
        return SecondHeader;
    }

    public SwagLabsSideMenu getSideMenu() {
        return sideMenu;
    }
}
