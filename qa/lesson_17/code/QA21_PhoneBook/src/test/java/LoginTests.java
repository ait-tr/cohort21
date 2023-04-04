import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getHeader().isLoginLinkPresent()) {
            app.getUser().clickOnSignOutButton();
        }
    }

    @Test(priority = 1)
    public void loginRegisteredUserPositiveTest() {

        app.getHeader().clickOnLoginLink();

        app.getUser().fillLoginRegForm(new User().setEmail("manuel+4@gmail.com").setPassword("Manuel12345$"));

        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isSignOutButtonPresent());
    }

    @Test(priority = 2)
    public void loginRegisteredUserNegativeWithInvalidPasswordTest() {

        app.getHeader().clickOnLoginLink();

        app.getUser().fillLoginRegForm(new User().setEmail("manuel+4@gmail.com").setPassword("Manuel12345"));

        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isAlertPresent());
    }
}
