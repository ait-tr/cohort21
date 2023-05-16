package com.ait.fw;

import com.ait.model.Reminder;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    public void selectDate(int index) {
        List<WebElement> days = driver.findElements(By.className("android.view.View"));
        days.get(index).click();
    }

    public void tapOnOk() {
        tap(By.id("ok"));
    }

    public void selectCertainMonth(String typeTime, String month,int number) {
        pause(1000);
        if (!selectedMonth().equals(month)) {
            for (int i = 0; i < number; i++) {
                if (typeTime.equals("future")) {
                    swipe(0.7,0.4);
                } else if (typeTime.equals("past")) {
                    swipe(0.5,0.8);
                }
            }
        }
    }

    private String selectedMonth() {
        return  driver.findElement(By.id("date_picker_month")).getText();
    }

    public void tapOnYear() {
        tap(By.id("date_picker_year"));
    }

    public void selectYear(String typeTm, String year) {
        pause(1000);
        if (!selectedYear().equals(year)) {
            if (typeTm.equals("future")) {
                swipeUpUntilNeededYear(year);
            } else if (typeTm.equals("past")) {
                swipeDownUntilNeededYear(year);
            }
        }
        tap(By.id("month_text_view"));
    }

    private void swipeDownUntilNeededYear(String year) {
        while (!selectedYear().equals(year)) {
            moveInElement(By.className("android.widget.ListView"),0.5,0.6);
            selectedYear();
        }
    }

    private void swipeUpUntilNeededYear(String year) {
        while (!selectedYear().equals(year)) {
            moveInElement(By.className("android.widget.ListView"),0.6,0.5);
            selectedYear();
        }
    }

    private void moveInElement(By locator, double down,double up) {

        TouchAction action = new TouchAction(driver);

        Dimension size = driver.manage().window().getSize();
        //get activity points
        int downPoint = (int) (size.height * down);
        int upPoint = (int) (size.height * up);
        //get Locator's point
        WebElement element = driver.findElement(locator);
        int leftX = element.getLocation().getX();
        int rightX = leftX + element.getSize().getWidth();
        int middleX = (leftX + rightX)/2;

        action.longPress(PointOption.point(middleX,downPoint))
                .moveTo(PointOption.point(middleX,upPoint))
                .release().perform();

    }

    private String selectedYear() {
        return driver.findElement(By.id("month_text_view")).getText();
    }


    public void tapOnTimeField() {
        tap(By.id("time"));
    }


    public void selectTime(String typeTime,int xHour, int yHour, int xMin, int yMin) {
        pause(1000);
        if (typeTime.equals("am")) {
            tapWithCoordinates(279,1318);
        } else if (typeTime.equals("pm")) {
            tapWithCoordinates(789,1318);
        }
        tapWithCoordinates(xHour,yHour);
        tapWithCoordinates(xMin,yMin);
    }

    private void tapWithCoordinates(int x, int y) {
        TouchAction action = new TouchAction(driver);

        action.tap(PointOption.point(x,y))
                .release()
                .perform();
    }

    public void selectRepetition(String repeat) {
        tap(By.id("repeat_no_text"));
        pause(1000);
        text(By.className("android.widget.EditText"),repeat);
        tap(By.xpath("//*[@text='OK']"));
    }

    public void selectTypeOfRepetition(String typeRep) {
        tap(By.id("RepeatType"));
        tap(By.xpath("//*[@text='" + typeRep + "']"));
    }

    public void enterAllData(Reminder reminder) {
        enterTitle(reminder.getTitle());
        tapOnDate();
        selectCertainMonth(reminder.getPeriod(), reminder.getMonth(), reminder.getNumber());
        selectDate(reminder.getIndex());
        tapOnYear();
        selectYear(reminder.getPeriod2(), reminder.getYear());
        tapOnOk();
        tapOnTimeField();
        selectTime(reminder.getTimeOfDay(), reminder.getXHour(), reminder.getYHour(),
                reminder.getXMin(), reminder.getYMin());
        tapOnOk();
        selectRepetition(reminder.getRepeat());
        swipe(reminder.getStart(), reminder.getStop());
        selectTypeOfRepetition(reminder.getTypeRep());
    }
}

