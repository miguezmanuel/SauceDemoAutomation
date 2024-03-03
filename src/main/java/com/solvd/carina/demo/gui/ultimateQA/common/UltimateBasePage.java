package com.solvd.carina.demo.gui.ultimateQA.common;

import com.solvd.carina.demo.gui.ultimateQA.components.UltimateHeader;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UltimateBasePage extends AbstractPage {

    @FindBy(xpath = "//div[@id='main-menu']")
    private UltimateHeader header;

    public UltimateBasePage(WebDriver driver) {
        super(driver);
    }

    public UltimateHeader getHeader() {
        return header;
    }
}
