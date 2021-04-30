package com.bartosz.asta.regularapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskOneSite {
    private final WebDriver driver;

    public TaskOneSite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#main-reset")
    private WebElement resetData;

    @FindBy(css = "[data-product-name='Okulary']")
    private WebElement glassesAddButton;

    // context search - pay attention to new syntax in css
    @FindBy(xpath = "//div[contains(@class, 'input-group') and .//*[@data-product-name='Okulary']]//input")
    private WebElement glassesAddQuantity;

    @FindBy(css = "[data-product-name='Piłka']")
    private WebElement ballAddButton;

    @FindBy(xpath = "//div[contains(@class, 'input-group') and .//*[@data-product-name='Piłka']]//input")
    private WebElement ballAddQuantity;

    @FindBy(css = ".basket-summary")
    public WebElement basketSummary;

    public void addGlassesToCart() {
        resetData.click();
        glassesAddQuantity.click();
        glassesAddQuantity.clear();
        glassesAddQuantity.sendKeys("1");
        glassesAddButton.click();
    }
}