package com.ait.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainScreenHelper extends BaseHelper {

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
//        int idCount = driver.findElements(By.id("thumbnail_image")).size();
//        System.out.println("Total reminders quantity is " + idCount);
//        return idCount;
        return driver.findElements(By.id("thumbnail_image")).size();
    }
}
