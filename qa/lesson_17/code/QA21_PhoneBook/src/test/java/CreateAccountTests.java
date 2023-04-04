import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getHeader().isLoginLinkPresent()) {

            app.getUser().clickOnSignOutButton();
        }
    }

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest() {

        app.getHeader().clickOnLoginLink();

        Assert.assertTrue(app.getUser().isLoginRegFormPresent());

        app.getUser().fillLoginRegForm(new User().setEmail("manuel+4@gmail.com").setPassword("Manuel12345$"));

        app.getUser().clickOnRegistrationButton();

        Assert.assertTrue(app.getUser().isSignOutButtonPresent());
    }

    @Test
    public void newUserRegistrationNegativeWithoutPasswordTest() {

        app.getHeader().clickOnLoginLink();

        Assert.assertTrue(app.getUser().isLoginRegFormPresent());

        app.getUser().fillLoginRegForm(new User().setEmail("manuel+4@gmail.com"));

        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isAlertPresent());
    }
}
