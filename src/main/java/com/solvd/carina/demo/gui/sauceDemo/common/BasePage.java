package com.solvd.carina.demo.gui.sauceDemo.common;

import com.solvd.carina.demo.gui.sauceDemo.components.Footer;
import com.solvd.carina.demo.gui.sauceDemo.components.Header;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BasePage extends AbstractPage {

    @FindBy(css = ".header_container")
    private Header header;
    @FindBy(css = ".footer")
    private Footer footer;

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public Header getHeader() {
        return header;
    }

    public Footer getFooter() {
        return footer;
    }
}
