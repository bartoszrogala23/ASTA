package com.bartosz.asta.regularapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TaskTwoSite {
    private final WebDriver driver;

    public TaskTwoSite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".select2-selection__arrow")
    private WebElement selectionDropdown;

    @FindBy(xpath = "//li[@role='treeitem'][contains(text(),'Sport')]")
    private WebElement sportItemsButton;

    @FindBy(xpath = "")
    private WebElement itemsCategory;

    @FindBy(xpath = "//div/div/p/strong")
    public WebElement foundElements;


    public void selectSportItems() {
        selectionDropdown.click();
        sportItemsButton.click();
    }

    public List<String> verifyFoundResults() {
        List<WebElement> foundElements = driver.findElements(By.cssSelector("//div/div/p/strong"));
        List<String> foundResults = new ArrayList<String>();
        for (int i = 0; i < foundElements.size(); i++) {
            foundResults.add(foundElements.get(i).getText());
        }
        return foundResults;

    }

}