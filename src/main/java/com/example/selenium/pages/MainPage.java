package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    //define title and logout WebElements using @FindBy
    @FindBy(how = How.TAG_NAME, using = "h2")
    private WebElement title;

    @FindBy(how = How.LINK_TEXT, using = "Logout")
    private WebElement logout;

    public MainPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        //return title text
        return title.getText();
    }

    public MainPage clickLogout() {
        //click logout and return MainPage
        logout.click();
        return this;
    }
}
