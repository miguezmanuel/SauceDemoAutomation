package com.solvd.carina.demo.gui.sauceDemo.pages;

import com.solvd.carina.demo.gui.sauceDemo.common.BasePage;
import com.solvd.carina.demo.gui.sauceDemo.components.Footer;
import com.solvd.carina.demo.gui.sauceDemo.components.Header;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InventoryPage extends BasePage {

    @FindBy(css = ".inventory_item")
    private List<ExtendedWebElement> productList;

    @FindBy(css = ".product_sort_container")
    private ExtendedWebElement sortingDropdown;

    @FindBy(css = ".shopping_cart_link")
    private ExtendedWebElement cartButton;

    @FindBy(css = ".inventory_item .btn_inventory")
    private List<ExtendedWebElement> addToCartButtons;

    @FindBy(css = ".inventory_item_name")
    private List<ExtendedWebElement> productNames;

    @FindBy(css = ".inventory_item_price")
    private List<ExtendedWebElement> productPrices;

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageLoaded() {
        return !productList.isEmpty();
    }

    public void addProductToCart(int index) {
        if (index >= 0 && index < addToCartButtons.size()) {
            addToCartButtons.get(index).click();
        } else {
            throw new IndexOutOfBoundsException("Invalid product index: " + index);
        }
    }

    public void openCart() {
        cartButton.click();
    }

    public void selectSortingOption(String option) {
        sortingDropdown.select(option);
    }

    public boolean isSortedLowToHigh() {
        List<Double> actualPrices = extractPrices();
        List<Double> sortedPrices = new ArrayList<>(actualPrices);
        Collections.sort(sortedPrices);
        return actualPrices.equals(sortedPrices);
    }

    public boolean isSortedHighToLow() {
        List<Double> actualPrices = extractPrices();
        List<Double> sortedPrices = new ArrayList<>(actualPrices);
        sortedPrices.sort(Collections.reverseOrder());
        return actualPrices.equals(sortedPrices);
    }

    public boolean isSortedByNameAscending() {
        List<String> actualNames = extractNames();
        List<String> sortedNames = new ArrayList<>(actualNames);
        Collections.sort(sortedNames);
        return actualNames.equals(sortedNames);
    }

    public boolean isSortedByNameDescending() {
        List<String> actualNames = extractNames();
        List<String> sortedNames = new ArrayList<>(actualNames);
        sortedNames.sort(Collections.reverseOrder());
        return actualNames.equals(sortedNames);
    }

    private List<Double> extractPrices() {
        List<Double> prices = new ArrayList<>();
        for (ExtendedWebElement priceElement : productPrices) {
            String priceText = priceElement.getText().replace("$", "");
            prices.add(Double.parseDouble(priceText));
        }
        return prices;
    }

    private List<String> extractNames() {
        List<String> names = new ArrayList<>();
        for (ExtendedWebElement nameElement : productNames) {
            names.add(nameElement.getText());
        }
        return names;
    }

    @Override
    public Header getHeader() {
        return super.getHeader();
    }

    @Override
    public Footer getFooter() {
        return super.getFooter();
    }
}
