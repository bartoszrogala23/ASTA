package com.bartosz.asta.regularapp;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskeThreeSite {
    private final WebDriver driver;

    public TaskeThreeSite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#main-reset")
    private WebElement resetDataButton;

    @FindBy(css = ".dropdown-toggle")
    private WebElement dropdownToggleMenuButton;

    @FindBy(xpath = "//li/a[contains(text(),'Formularz')]")
    private WebElement formButton;

    @FindBy(css = "#start-edit")
    private WebElement startEditButton;

    @FindBy(css = "#in-name")
    private WebElement firstNameField;

    @FindBy(css = "#in-surname")
    private WebElement lastNameField;

    @FindBy(css = "#in-notes")
    private WebElement notesField;

    @FindBy(css = "#in-phone")
    private WebElement phoneField;

    @FindBy(css = "#in-file")
    private WebElement uploadFileButton;

    @FindBy(css = "#save-btn")
    private WebElement saveButton;

    public void resetData() {
        resetDataButton.click();
    }

    public void activateForm() {
        dropdownToggleMenuButton.click();
        formButton.click();
        startEditButton.click();
    }

    public void fillTheForm() {
        Faker faker = new Faker();
        firstNameField.sendKeys(faker.name().firstName());
        lastNameField.sendKeys(faker.name().lastName());
        notesField.sendKeys(faker.address().fullAddress());
        phoneField.sendKeys("123345567");
        uploadFileButton.sendKeys("C:\\Bartosz\\files4testing\\image.jpg");
        saveButton.click();

    }

}
