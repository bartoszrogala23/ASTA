package com.bartosz.regularapp;

import com.bartosz.asta.regularapp.AstaBasePage;
import com.bartosz.asta.regularapp.TaskOneSite;
import com.bartosz.asta.regularapp.TaskTwoSite;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class AstaBaseTest {
    protected AstaBasePage astaBasePage;
    protected TaskOneSite taskOneSite;
    protected TaskTwoSite taskTwoSite;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        astaBasePage = new AstaBasePage(driver);
        taskOneSite = new TaskOneSite(driver);
        taskTwoSite = new TaskTwoSite(driver);
    }
}
