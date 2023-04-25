package tests.alertFrameWindows;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SidePanel;
import pages.alertsFrameWindows.AlertsPage;
import tests.TestBase;

public class AlertsTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectAlerts();
    }

    @Test
    public void alertWithTimerTest() {
        new AlertsPage(driver).clickByAlertButtonWithTimer();
    }

    @Test
    public void alertWithSelect() {
        new AlertsPage(driver).clickByAlertButtonWithSelect("ok")
                .assertByResult("Ok");
    }

    @Test
    public void sendTextToAlertTest() {
        new AlertsPage(driver).sendTextToAlert("Hello World!")
                .acceptByMessage("Hello World!");
    }
}
