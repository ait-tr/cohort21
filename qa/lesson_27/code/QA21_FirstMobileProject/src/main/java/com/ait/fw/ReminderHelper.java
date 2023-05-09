package com.ait.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class ReminderHelper extends BaseHelper{

    public ReminderHelper(AppiumDriver driver) {
        super(driver);
    }

    public void enterTitle(String title) {
        text(By.id("reminder_title"),title);
    }

    public void saveReminder() {
        tap(By.id("save_reminder"));
    }

    public void selectMonth(String time) {
        pause(1000);
        if (time.equals("past")) {
            swipe(0.5,0.8);
        } if (time.equals("future")) {
            swipe(0.7,0.4);
        }

    }

    public void swipe(double start, double stop) {

        TouchAction action = new TouchAction(driver);

        Dimension size = driver.manage().window().getSize();

        int x = size.width / 2;

        int startY = (int) (size.height * start);
        int stopY = (int) (size.height * stop);

        action.longPress(PointOption.point(x,startY))
                .moveTo(PointOption.point(x,stopY))
                .release().perform();

    }

    public void tapOnDate() {
        tap(By.id("date"));
    }
}
