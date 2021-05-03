package com.bartosz.asta.regularapp;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;

public class TaskFourSite {
    private final WebDriver driver;

    public TaskFourSite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".btn-primary")
    private WebElement applyButton;

    @FindBy(css = "[name='name']")
    private WebElement fullNameField;

    @FindBy(css = "[name='email']")
    private WebElement emailField;

    @FindBy(css = "[name='phone']")
    private WebElement phoneField;

    @FindBy(css = "#save-btn")
    private WebElement saveButton;

    @FindBy(css = "[src='https://testingcup.pgs-soft.com/task_4_frame']")
    private WebElement iFrame;



    public void goToApplyForm() {
        applyButton.click();
    }

    public void switchToFrame() {
        driver.switchTo().frame(0);
    }

    public  void switchWindow() {
        String winHandleBefore = driver.getWindowHandle();
        applyButton.click();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        Faker faker = new Faker();
        fullNameField.sendKeys(faker.name().fullName());
        emailField.sendKeys(faker.internet().emailAddress());
        phoneField.sendKeys("100-200-300");
        saveButton.click();
    }

    public void fillTheForm() {
        Faker faker = new Faker();
        fullNameField.sendKeys(faker.name().fullName());
        emailField.sendKeys(faker.internet().emailAddress());
        phoneField.sendKeys("100-200-300");
        saveButton.click();
    }
}
