package com.bartosz.regularapp;

import com.bartosz.asta.regularapp.AstaBasePage;
import com.bartosz.asta.regularapp.TaskOneSite;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class AstaBaseTest {
    protected AstaBasePage astaBasePage;
    protected TaskOneSite taskOneSite;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        astaBasePage = new AstaBasePage(driver);
        taskOneSite = new TaskOneSite(driver);
//        driver.get("https://testingcup.pgs-soft.com/task_1");
//        driver.get("https://asta.pgs-soft.com/");
//        driver.findElement(By.cssSelector("[href='http://testingcup.pgs-soft.com']")).click();
    }
}
