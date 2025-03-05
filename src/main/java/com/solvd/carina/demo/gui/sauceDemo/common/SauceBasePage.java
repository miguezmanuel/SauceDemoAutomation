package com.solvd.carina.demo.gui.sauceDemo.common;

import com.solvd.carina.demo.gui.sauceDemo.components.SauceFooter;
import com.solvd.carina.demo.gui.sauceDemo.components.SauceHeader;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SauceBasePage extends AbstractPage {

    @FindBy(css = ".header_container")
    private SauceHeader header;
    @FindBy(css = ".footer")
    private SauceFooter footer;

    public SauceBasePage(WebDriver driver) {
        super(driver);
    }

    public SauceHeader getHeader() {
        return header;
    }

    public SauceFooter getFooter() {
        return footer;
    }
}
