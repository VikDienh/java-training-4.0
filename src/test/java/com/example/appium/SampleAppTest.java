package com.example.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.Paths;

import static io.appium.java_client.service.local.flags.GeneralServerFlag.BASEPATH;
import static java.lang.System.getenv;

public class SampleAppTest {
    private AppiumDriverLocalService server;
    private AppiumDriver driver;

    @BeforeClass
    private void setUp() {
        String platform = getenv("APPIUM_DRIVER");
        platform = platform == null ? "ANDROID" : platform.toUpperCase();
        String path = System.getProperty("user.dir");

        if (platform.equals("ANDROID")) {
            var options = new UiAutomator2Options()
                    .setPlatformName("Android")
                    .setDeviceName("emulator-5554")
                    .setApp(Paths.get(path).resolve("ApiDemos-debug.apk").toString());

            server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(4723).withArgument(BASEPATH, "/")
                    .withIPAddress("127.0.0.1"));
            server.start();
            driver = new AndroidDriver(server, options);

            ((InteractsWithApps) driver).activateApp("io.appium.android.apis");
        } else if (platform.equals("IOS")) {
            var options = new XCUITestOptions()
                    .setPlatformName("iOS")
                    .setPlatformVersion("18.1")
                    .setAutomationName("XCuiTest")
                    .setDeviceName("iPhone 16")
                    .setUdid("F4C549C8-23CE-4EB5-9DB7-92BE893BCE60")
                    .setApp(Paths.get(path).resolve("TestApp.app.zip").toString());

            server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(4723).withArgument(BASEPATH, "/")
                    .withIPAddress("127.0.0.1"));
            server.start();
            driver = new IOSDriver(server, options);
        }
    }

    @Test
    public void textFieldTest() {
        // initialise PageView and set "text" to its textField
        PageView view = new PageView(driver);
        view.navigateToTextFieldScreen().setTextField("test");

        // assert that textField equals to "text"
        Assert.assertEquals(view.getTextField(), "test", "Text field was not set");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        if (server != null) {
            server.stop();
        }
    }
}