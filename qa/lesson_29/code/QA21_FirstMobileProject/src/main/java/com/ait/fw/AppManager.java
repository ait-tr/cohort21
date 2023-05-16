package com.ait.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppManager {

    AppiumDriver driver;
    DesiredCapabilities capabilities;

    MainScreenHelper mainScreen;
    ReminderHelper reminder;

    public void init() throws MalformedURLException {
        capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","8.0");
        capabilities.setCapability("deviceName","mob");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","com.blanyal.remindly");
        capabilities.setCapability("appActivity","com.blanyal.remindme.MainActivity");
        capabilities.setCapability("app","...");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        mainScreen = new MainScreenHelper(driver);
        reminder = new ReminderHelper(driver);
    }

    public ReminderHelper getReminder() {
        return reminder;
    }

    public MainScreenHelper getMainScreen() {
        return mainScreen;
    }

    public void stop() {
        driver.quit();
    }
}
