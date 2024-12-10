package com.example.selenium;

import com.example.selenium.steps.UserSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps userSteps;
    JavascriptExecutor js;

    @BeforeClass
    public void setUp() {
        // initialize a driver, open login URL, resize windows, and initialize steps
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().setSize(new Dimension(840, 1027));
        userSteps = new UserSteps(driver);
    }

    @AfterClass
    public void tearDown() {
        // driver close and quit
        driver.close();
        driver.quit();
    }
}
