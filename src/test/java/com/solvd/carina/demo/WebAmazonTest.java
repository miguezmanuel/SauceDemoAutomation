package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.amazon.components.AmazonChoseLocationCard;
import com.solvd.carina.demo.gui.amazon.components.AmazonHeader;
import com.solvd.carina.demo.gui.amazon.components.AmazonSearchBar;
import com.solvd.carina.demo.gui.amazon.pages.AmazonHomePage;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

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

    @Test
    public void checkCategoriesList () {
        AmazonHomePage amazonHomePage = new AmazonHomePage(getDriver());
        AmazonHeader amazonHeader = amazonHomePage.getAmazonHeader();
        AmazonSearchBar amazonSearchBar = amazonHomePage.getAmazonSearchBar();

        amazonHomePage.open();
        amazonSearchBar.clickSelectCategoryButton();
        List<String> musicCategories = amazonSearchBar.getCategorySelectList("Music");

        for (int i = 0; i > musicCategories.size(); i++) {
            String element = musicCategories.get(i);
            Boolean result = element.contains("music") ? true : false;
            Assert.assertTrue(result, "list element" + element + "does not contain 'Music'");
        }
    }

    @Test
    public void checkSearchResultsList () {
        AmazonHomePage amazonHomePage = new AmazonHomePage(getDriver());
        AmazonHeader amazonHeader = amazonHomePage.getAmazonHeader();
        AmazonSearchBar amazonSearchBar = amazonHomePage.getAmazonSearchBar();

        amazonHomePage.open();
        amazonSearchBar.typeSearchInputField("Iphone");

        List<String> iphoneResultsList = amazonSearchBar.getSearchResultsListWithContainingKeys("Iphone");


        for (int i = 0; i < iphoneResultsList.size(); i++) {
            String element = iphoneResultsList.get(i);
            Boolean result = element.contains("Iphone") ? true : false;
            Assert.assertTrue(result, "Search results list is not returning " + element + " values");
        }
    }

}
