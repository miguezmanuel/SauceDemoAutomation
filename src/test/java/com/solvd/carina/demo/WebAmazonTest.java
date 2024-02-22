package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.amazon.components.AmazonChoseLocationCard;
import com.solvd.carina.demo.gui.amazon.components.AmazonHeader;
import com.solvd.carina.demo.gui.amazon.pages.AmazonHomePage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebAmazonTest implements IAbstractTest {

    @Test
    public void checkLocationChangeZipCodeErrorTextTest () {
        AmazonHomePage amazonHomePage = new AmazonHomePage(getDriver());
        AmazonHeader amazonHeader = amazonHomePage.getAmazonHeader();
        AmazonChoseLocationCard amazonChoseLocationCard = amazonHomePage.getAmazonChoseLocationCard();

        amazonHomePage.open();
        amazonHeader.clickDeliverButton();
        amazonChoseLocationCard.typeZipCodeInputField("error");
        amazonChoseLocationCard.clickApplyButton();
        Assert.assertEquals(amazonChoseLocationCard.getZipCodeErrorText(), "Please enter a valid US zip code");

    }

    @Test
    public void changeLocationToArgentinaTest () {
        AmazonHomePage amazonHomePage = new AmazonHomePage(getDriver());
        AmazonHeader amazonHeader = amazonHomePage.getAmazonHeader();
        AmazonChoseLocationCard amazonChoseLocationCard = amazonHomePage.getAmazonChoseLocationCard();

        amazonHomePage.open();
        amazonHeader.clickDeliverButton();
        amazonChoseLocationCard.clickSelectCountryButton();
        amazonChoseLocationCard.selectCountry("Argentina");
    }
}
