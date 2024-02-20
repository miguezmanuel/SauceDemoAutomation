package com.solvd.carina.demo.gui.reddit.pages;

import com.solvd.carina.demo.gui.reddit.components.RedditSubmitTextBox;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RedditSubmitPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='_3cWzf-usAKfGV1Ay7h2zM_']")
    private ExtendedWebElement chooseCommunityInputField;
    @FindBy(xpath = "//*[@class='Z1w8VkpQ23E1Wdq_My3U4 j1Q89sB76i7EBRDhnQhlr']")
    private ExtendedWebElement postOptionButton;
    @FindBy(xpath = "//*[@class='_3WIAbYQQdSmuuFLDSfhn5_ icon icon-image_post']/..")
    private ExtendedWebElement imageAndVideoOptionButton;
    @FindBy(xpath = "//*[@class='_3WIAbYQQdSmuuFLDSfhn5_ icon icon-link_post]/..")
    private ExtendedWebElement linkOptionButton;
    @FindBy(xpath = "//*[@class='_3WIAbYQQdSmuuFLDSfhn5_ icon icon-poll_post']/..")
    private ExtendedWebElement pollOptionButton;
    @FindBy(xpath = "//*[@placeholder='Title']")
    private ExtendedWebElement titleInputField;
    @FindBy(xpath = "//*[@class='_1T0P_YQg7fOYLCRoKl_xxO ']")
    private ExtendedWebElement postButton;
    @FindBy(xpath = "//*[@class='_3MknXZVbkWU8JL9XGlzASi _3wl1bRnSzxHkKJfvqakrNI Mb0x12Cu8JKRJRJCcf9_K   ']")
    private RedditSubmitTextBox redditSubmitTextBox;

    public RedditSubmitPage(WebDriver driver) {
        super(driver);
    }

    public boolean isChooseCommunityInputFieldPresent () {
        return chooseCommunityInputField.isPresent();
    }

    public void typeChooseCommunity (String community) {
        chooseCommunityInputField.type(community);
    }


}
