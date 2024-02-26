package com.solvd.carina.demo.gui.amazon.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonSearchBar extends AbstractUIObject {

    @FindBy(xpath = "//*[@aria-describedby='searchDropdownDescription']")
    private ExtendedWebElement selectCategoryButton;
    @FindBy(xpath = "//*[@id='nav-search-dropdown-card']")
    private List <ExtendedWebElement> categorySelectList;
    @FindBy(css = "input#twotabsearchtextbox")
    private ExtendedWebElement searchInputField;
    @FindBy(xpath = "//div[@class='left-pane-results-container']/div")
    private List<WebElement> searchResultsList;
    @FindBy(css = "input#nav-search-submit-button")
    private ExtendedWebElement searchButton;

    public AmazonSearchBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickSelectCategoryButton () {
        selectCategoryButton.click();
    }

    public void typeSearchInputField (String searchInput) {
        searchInputField.type(searchInput);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until((e) -> searchResultsList.size() > 0);
    }

    public void clickSearchButton () {
        searchButton.click();
    }

    public List<String> getCategorySelectListWithContainingKeys(String containingKeys) {
        String category;
        List<String> list = null;

        for (int i = 0; i < categorySelectList.size(); i++) {
            category = categorySelectList.get(i).toString();
            if (category.contains(containingKeys)) {
                list.add(category);
            }
        }

        return list;
    }

    public List<String> getSearchResultsListWithContainingKeys (String containingKeys) {
        List<String> list = null;
        String element;

        for (int i = 0; i < searchResultsList.size(); i++) {
            element = searchResultsList.get(i).toString();
            if (element.contains(containingKeys)) {
                list.add(element);
            }
        }

        return list;
    }

    public boolean isSearchResultsListEmpty () {
        return searchResultsList.isEmpty();
    }



}
