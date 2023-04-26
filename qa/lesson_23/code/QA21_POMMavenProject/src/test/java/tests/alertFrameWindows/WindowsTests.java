package tests.alertsFrameWindow;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SidePanel;
import pages.alertsFrameWindows.BrowserWindowsPage;
import tests.TestBase;

public class WindowsTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectBrowserWindows();
    }

    @Test
    public void newTabTest() {
        new BrowserWindowsPage(driver).clickByNewTabButton()
                .acceptByText("This is a sample page");
    }
}
