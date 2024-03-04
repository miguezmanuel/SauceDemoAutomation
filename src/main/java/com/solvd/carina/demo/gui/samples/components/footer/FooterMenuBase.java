package com.solvd.carina.demo.gui.samples.components.footer;

import com.solvd.carina.demo.gui.samples.pages.common.HomePageBase;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import com.solvd.carina.demo.gui.samples.pages.common.NewsPageBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;

public abstract class FooterMenuBase extends AbstractUIObject {

    public FooterMenuBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract NewsPageBase openNewsPage();

    public abstract HomePageBase openHomePage();
}
