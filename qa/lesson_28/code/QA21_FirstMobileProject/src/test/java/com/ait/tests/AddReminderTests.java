package com.ait.tests;

import org.testng.Assert;
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
}
