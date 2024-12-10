package com.example.selenium.steps;

import com.example.selenium.pages.BasePage;
import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class UserSteps {
    private WebDriver driver;
    LoginPage loginPage;
    MainPage mainPage;

    public UserSteps(WebDriver driver) {

        this.driver = driver;
    }

    public UserSteps login(String username, String password) {
        // initialize LoginPage, call setUsername, setPassword, and click login methods
        loginPage = new LoginPage(driver);
        mainPage = loginPage.setUsername(username)
                .setPassword(password)
                .clickLogin();

        //  assert title
        assertEquals(mainPage.getTitle(), "Secure Area", "login failed");
        return this;
    }

    public UserSteps logout() {
        // call logout method
        mainPage.clickLogout();
        return this;
    }
}
