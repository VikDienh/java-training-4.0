package com.example.appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageView {
    AppiumDriver driver;

    // define textField MobileElement using @FindBy kind of annotations for iOS and Android
    @AndroidFindBy(id = "io.appium.android.apis:id/edit")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'IntegerA'")

    private WebElement textField;

    public PageView(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //public PageView navigateToTextFieldScreen() {

        //driver.findElement(AppiumBy.androidUIAutomator("text(\"Views\")")).click();

        //driver.findElement(AppiumBy.androidUIAutomator(
                //"new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        //".scrollIntoView(new UiSelector().textContains(\"TextFields\").instance(0))")).click();
        public PageView navigateToTextFieldScreen() {
            if (driver instanceof io.appium.java_client.ios.IOSDriver) {
                driver.findElement(AppiumBy.accessibilityId("Views")).click();

                driver.findElement(AppiumBy.iOSNsPredicateString("name CONTAINS 'TextFields'")).click();
            } else if (driver instanceof io.appium.java_client.android.AndroidDriver) {
                driver.findElement(AppiumBy.androidUIAutomator("text(\"Views\")")).click();

                driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                                ".scrollIntoView(new UiSelector().textContains(\"TextFields\").instance(0))")).click();
            }

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("io.appium.android.apis:id/edit")));

        return this;
    }

    public String getTextField() {
        // return text from the textField element
        return textField.getText();
    }

    public PageView setTextField(String text) {
        // set text to the textField element
        textField.sendKeys(text);
        return this;
    }
}