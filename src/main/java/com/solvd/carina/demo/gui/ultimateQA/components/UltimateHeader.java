package com.solvd.carina.demo.gui.ultimateQA.components;

import com.solvd.carina.demo.gui.ultimateQA.pages.UltimateAcademyPage;
import com.solvd.carina.demo.gui.ultimateQA.pages.UltimateHomePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UltimateHeader extends AbstractUIObject {

    @FindBy(xpath = "//*[@class='et_pb_menu__logo']")
    private ExtendedWebElement ultimateQATitleButton;
    @FindBy(xpath = "//ul[@id='menu-main-menu']//a[text()='Java SDET Academy']")
    private ExtendedWebElement javaAcademyButton;
    @FindBy(xpath = "//ul[@id='menu-main-menu']//a[text()='Learning']")
    private ExtendedWebElement learningButton;
    @FindBy(xpath = "//ul[@id='menu-main-menu']//a[text()='Success Stories']")
    private ExtendedWebElement successStoriesButton;
    @FindBy(xpath = "//ul[@id='menu-main-menu']//a[text()='Blog']")
    private ExtendedWebElement blogButton;
    @FindBy(xpath = "//ul[@id='menu-main-menu']//a[text()='About']")
    private ExtendedWebElement aboutButton;
    @FindBy(xpath = "//ul[@id='menu-main-menu']//a[text()='I want a free DISCOVERY SESSION']")
    private ExtendedWebElement freeDiscoverySession;

    public UltimateHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isTitleButtonClickable() {
        return ultimateQATitleButton.isClickable();
    }

    public UltimateHomePage clickTitleButton () {
        ultimateQATitleButton.click();
        return new UltimateHomePage(getDriver());
    }

    public UltimateAcademyPage clickJavaAcademyButton () {
        javaAcademyButton.click();
        return new UltimateAcademyPage(getDriver());
    }

    public void hoverLearningButton () {
        learningButton.hover();
    }

    public void clickSuccessStoriesButton () {
        successStoriesButton.click();
    }

    public void clickBlogButton () {
        blogButton.click();
    }

    public void clickAboutButton () {
        aboutButton.click();
    }

    public void clickFreeDiscoverySession () {
        freeDiscoverySession.click();
    }




}
