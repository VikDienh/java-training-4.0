package com.example.selenium;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        // use steps for the login and logout
        userSteps.login("tomsmith", "SuperSecretPassword!")
                .logout();
    }
}
