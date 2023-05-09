package com.ait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddReminderTests extends TestBase{

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
        //asser add new reminder
        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd,quantityBeforeAdd + 1);
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
        //save reminder
        app.getReminder().saveReminder();
        //asser add new reminder
        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd,quantityBeforeAdd + 1);
    }
}
