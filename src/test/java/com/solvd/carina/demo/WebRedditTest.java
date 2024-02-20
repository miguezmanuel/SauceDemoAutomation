package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.reddit.pages.RedditHomePage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;

public class WebRedditTest implements IAbstractTest {

    @Test
    public void goToProfileButtonTest() {
        RedditHomePage redditHomePage = new RedditHomePage(getDriver());
        redditHomePage.open();


    }
}
