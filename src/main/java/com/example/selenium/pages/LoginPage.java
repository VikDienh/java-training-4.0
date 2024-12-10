package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    //define username, password, and login WebElements using @FindBy
    @FindBy(how = How.NAME, using = "username")
    private WebElement username;

    @FindBy(how = How.ID, using = "password")
    private WebElement password;

    @FindBy(how = How.CSS, using = ".fa")
    private WebElement login;

    public LoginPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage setUsername(String text) {
        //set username
        username.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        //set password
        password.sendKeys(text);
        return this;
    }

    public MainPage clickLogin() {
        //click logout return instance of MainPage
        login.click();
        return new MainPage(driver);
    }
}
