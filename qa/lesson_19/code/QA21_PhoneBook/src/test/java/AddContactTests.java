import model.Contact;
import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isSignOutButtonPresent()) {
            app.getHeader().clickOnLoginLink();

            app.getUser().fillLoginRegForm(new User()
                    .setEmail("manuel+4@gmail.com")
                    .setPassword("Manuel12345$"));
            app.getUser().clickOnLoginButton();
        }
    }

    @Test
    public void addContactPositiveTest() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;

        app.getContact().clickOnAddLink();

        app.getContact().addContact(new Contact().setName("Karl" + i)
                .setSurName("Adam")
                .setPhone("1234567890")
                .setEmail("adam@gm.co")
                .setAddress("Koblenz")
                .setDesc("torwart"));

        app.getContact().clickOnSaveButton();

        Assert.assertTrue(app.getContact().isContactCreated("Karl"));
    }
}
