package com.ait.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainScreenHelper extends BaseHelper{

    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }

    public boolean isNoReminderTextPresent() {
        return isElementPresent(By
                .xpath("//*[@resource-id='com.blanyal.remindly:id/no_reminder_text']"));
    }

    public void tapOnAddReminder() {
        tap(By.id("add_reminder"));
    }

    public int getTotalReminders() {
        return driver.findElements(By.id("thumbnail_image")).size();
    }

    public String isTitlePresent() {

        String text = driver.findElement(By.id("recycle_title")).getText();
        System.out.println(text);
        return text;
    }
}
