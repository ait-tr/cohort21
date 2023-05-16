package com.ait.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

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

    public void removeReminder() {
        TouchAction action = new TouchAction(driver);

        Dimension size = driver.manage().window().getSize();

        int x = size.width / 2;
        int y = size.height / 5;

        action.longPress(PointOption.point(x,y))
                .release().perform();

        tap(By.id("discard_reminder"));
    }
}
