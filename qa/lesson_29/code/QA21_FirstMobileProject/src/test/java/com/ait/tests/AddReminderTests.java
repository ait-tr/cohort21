package com.ait.tests;

import com.ait.model.Reminder;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AddReminderTests extends TestBase {

    @Test
    public void addReminderWithTitleTest() {
        int quantityBeforeAdd;
        int quantityAfterAdd;
        quantityBeforeAdd = app.getMainScreen().getTotalReminders();
        //tap on add reminder
        app.getMainScreen().tapOnAddReminder();
        //enter reminder title
        app.getReminder().enterTitle("Test");
        //save reminder
        app.getReminder().saveReminder();
        //assert add new reminder by number
        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd, quantityBeforeAdd + 1);
    }

    @Test
    public void addReminderWithRandomSwipeTest() {
        int quantityBeforeAdd;
        int quantityAfterAdd;
        quantityBeforeAdd = app.getMainScreen().getTotalReminders();
        //tap on add reminder
        app.getMainScreen().tapOnAddReminder();
        //enter reminder title
        app.getReminder().enterTitle("Test");
        //choose random month
        app.getReminder().tapOnDate();
        app.getReminder().selectMonth("future");
        //choose date
        app.getReminder().selectDate(4);
        //tap 0n OK
        app.getReminder().tapOnOk();
        //save reminder
        app.getReminder().saveReminder();
        //assert add new reminder by number
        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd, quantityBeforeAdd + 1);
    }

    @Test
    public void addReminderWithAllDataTest() {
        //tap on add reminder
        app.getMainScreen().tapOnAddReminder();
        //enter reminder title
        app.getReminder().enterTitle("Feiertag");
        //choose certain month
        app.getReminder().tapOnDate();
        app.getReminder().selectCertainMonth("future", "JUL", 3);
        //choose date
        app.getReminder().selectDate(29);
        //tap on year
        app.getReminder().tapOnYear();
        //select year
        app.getReminder().selectYear("past", "2020");
        //tap on OK
        app.getReminder().tapOnOk();
        //tap on time field
        app.getReminder().tapOnTimeField();
        //select time
        app.getReminder().selectTime("pm", 805, 922, 538, 656);
        //tap on OK
        app.getReminder().tapOnOk();
        //select repetition interval
        app.getReminder().selectRepetition("3");
        //swipe up
        app.getReminder().swipe(0.8, 0.5);
        //select type of repetitions
        app.getReminder().selectTypeOfRepetition("Month");
        //save reminder
        app.getReminder().saveReminder();
        //assert by text
        Assert.assertTrue(app.getMainScreen().isTitlePresent().contains("Feiertag"));
    }

    @Test
    public void addReminderShortTest() {
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterAllData(Reminder.builder()
                .title("Feiertag").period("future").month("JUL").number(3).index(15).period2("future")
                .year("2026").timeOfDay("pm").xHour(805).yHour(922).xMin(538).yMin(656)
                .repeat("4").start(0.8).stop(0.5).typeRep("Month").build());
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isTitlePresent().contains("Feiertag"));
    }


    @AfterMethod
    public void removeReminder() {
        app.getMainScreen().removeReminder();
    }
}
