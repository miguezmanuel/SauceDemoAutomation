package com.solvd.carina.demo.gui.amazon.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonChoseLocationCard extends AbstractUIObject {

    @FindBy(xpath = "//*[@aria-label='Sign in to see your addresses']")
    private ExtendedWebElement signInButton;
    @FindBy(xpath = "//*[@aria-label='or enter a US zip code']")
    private ExtendedWebElement zipCodeInputField;
    @FindBy(xpath = "//*[@aria-labelledby='GLUXZipUpdate-announce']")
    private ExtendedWebElement applyButton;
    @FindBy(css = "span#GLUXCountryListDropdown")
    private ExtendedWebElement selectCountryButton;
    @FindBy(xpath = "//a[@class='a-dropdown-link' and text()='%s']")
    private ExtendedWebElement countryToBeSelected;
    @FindBy(xpath = "(//div[@class='a-box a-alert-inline a-alert-inline-error'])[1]")
    private ExtendedWebElement zipCodeErrorText;
    @FindBy(xpath = "//button[@name='glowDoneButton']")
    private ExtendedWebElement doneButton;


    public AmazonChoseLocationCard(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isSignInButtonPresent () {
        return signInButton.isPresent();
    }

    public void selectCountry(String country){
        countryToBeSelected.format(country).click();
    }

    public void clickSignInButton () {
        signInButton.click();
    }

    public void typeZipCodeInputField (String zipCodeInput) {
        zipCodeInputField.type(zipCodeInput);
    }

    public void clickApplyButton () {
        applyButton.click();
    }

    public void clickSelectCountryButton () {
        selectCountryButton.click();
    }

    public String getZipCodeErrorText () {
        return zipCodeErrorText.getText();
    }

    public void clickDoneButton () {
        doneButton.click();
    }
}
