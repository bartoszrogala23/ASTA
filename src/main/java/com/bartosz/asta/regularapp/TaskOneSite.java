package com.bartosz.asta.regularapp;

import org.openqa.selenium.By;
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
    private WebElement addProductButton;

    // context search - pay attention to new syntax in css
    @FindBy(xpath = "//div[contains(@class, 'input-group') and .//*[@data-product-name='Okulary']]//input")
    private WebElement addQuantity;

    @FindBy(css = ".basket-summary")
    public WebElement basketSummary;

    public void addGlassesToCart() {
        resetData.click();
        addQuantity.click();
        addQuantity.sendKeys("1");
        addProductButton.click();
    }
}