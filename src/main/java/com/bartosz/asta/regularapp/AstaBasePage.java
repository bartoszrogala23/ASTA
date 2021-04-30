package com.bartosz.asta.regularapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AstaBasePage {
    private final WebDriver driver;


    public AstaBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".col-md-6 [href='/task_1']")
    private WebElement taskOneButton;

    @FindBy(xpath = "//h2[contains(text(),'2')]")
    private WebElement taskTwoButton;


    public void goToTaskOne() {
        taskOneButton.click();
    }

    public void goToTaskTwo() {
        taskTwoButton.click();
    }

}