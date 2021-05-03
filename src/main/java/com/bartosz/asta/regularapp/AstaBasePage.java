package com.bartosz.asta.regularapp;

import org.openqa.selenium.By;
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

    @FindBy(css = ".col-md-6 [href='/task_1'] h2")
    private WebElement taskOneButton;

    @FindBy(xpath = "//h2[contains(text(),'2')]")
    private WebElement taskTwoButton;


    public void goToTaskOne() {
        driver.findElement(By.cssSelector(".col-md-6 [href='/task_1'] h2")).click();
    }

    public void goToTaskTwoSite() {
        driver.get("https://testingcup.pgs-soft.com/task_2");
    }

    public void goToTaskOneManually() {
        driver.get("https://testingcup.pgs-soft.com/task_1");
    }

    public void goToTaskThreeSite() {
        driver.get("https://testingcup.pgs-soft.com/task_3");
    }

    public void goToTaskFourSite() {
        driver.get("https://testingcup.pgs-soft.com/task_4");
    }


    public void goToTaskTwo() {
        taskTwoButton.click();
    }

}