package tests.bookStore;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SidePanel;
import pages.bookStore.LoginPage;
import pages.bookStore.ProfilePage;
import pages.data.UserData;
import tests.TestBase;

public class LoginPageTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getBookStore();
        new SidePanel(driver).getLoginPage();
    }

    @Test
    public void loginPositiveTest() {
        new LoginPage(driver)
                .login(UserData.USER_NAME,UserData.USER_PASSWORD)
                .assertAccount(UserData.USER_NAME);
    }

    @AfterMethod
    public void postCondition() {
        new ProfilePage(driver).logout();
    }
}
