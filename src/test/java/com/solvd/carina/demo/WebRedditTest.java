package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.reddit.components.RedditHeader;
import com.solvd.carina.demo.gui.reddit.components.RedditLoginCard;
import com.solvd.carina.demo.gui.reddit.pages.RedditHomePage;
import com.solvd.carina.demo.gui.reddit.pages.RedditSubmitPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebRedditTest implements IAbstractTest {

    @Test
    @MethodOwner (owner = "manumiguezz")
    public void goToPostTest() {
        RedditHomePage redditHomePage = new RedditHomePage(getDriver());
        RedditHeader redditHeader = redditHomePage.getRedditHeader();
        RedditSubmitPage redditSubmitPage = new RedditSubmitPage(getDriver());
        redditHomePage.open();

        Assert.assertTrue(redditHeader.isCreateButtonClickable());
        redditHeader.clickCreateButton();

        Assert.assertTrue(redditSubmitPage.isChooseCommunityInputFieldPresent());

    }

    @Test
    @MethodOwner (owner = "manumiguezz")
    public void loginTest () {
        RedditHomePage redditHomePage = new RedditHomePage(getDriver());
        RedditHeader redditHeader = redditHomePage.getRedditHeader();
        RedditLoginCard redditLoginCard = redditHomePage.getRedditLoginCard();

        redditHomePage.open();
        Assert.assertTrue(redditHeader.isLoginButtonClickable());
        redditHeader.clickLoginButton();

        Assert.assertTrue(redditLoginCard.isGoogleLoginButtonPresent(), "google login button not present, login card not loaded");
        Assert.assertTrue(redditLoginCard.isUsernamePresent());
        redditLoginCard.typeUsername("Example15095");
        redditLoginCard.typePassword("Example45935");
        redditLoginCard.clickLoginButton();

    }
}
