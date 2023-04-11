import model.Contact;
import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() {
        if (!app.getHeader().isLoginLinkPresent()) {
            app.getUser().clickOnSignOutButton();
        } else {
            app.getHeader().clickOnLoginLink();
            app.getUser().fillLoginRegForm(new User()
                    .setEmail("manuel+4@gmail.com")
                    .setPassword("Manuel12345$"));
            app.getUser().clickOnLoginButton();

            app.getContact().clickOnAddLink();
            app.getContact().addContact(new Contact().setName("Karl")
                    .setSurName("Adam")
                    .setPhone("1234567890")
                    .setEmail("adam@gm.co")
                    .setAddress("Koblenz")
                    .setDesc("torwart"));
            app.getContact().clickOnSaveButton();
        }
    }

    @Test
    public void removeContactTest() {
        int sizeBefore = app.getContact().sizeOfContacts();
        System.out.println(sizeBefore);

        app.getContact().removeContact();
        app.getContact().pause(1000);
        int sizeAfter = app.getContact().sizeOfContacts();
        System.out.println(sizeAfter);

        Assert.assertEquals(sizeBefore - 1, sizeAfter);
    }
}
