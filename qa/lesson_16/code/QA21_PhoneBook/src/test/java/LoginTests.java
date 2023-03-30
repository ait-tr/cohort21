import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[contains(.,'LOGIN')]"))) {
            //click on Sign out button
            click(By.xpath("//button[contains(.,'Sign Out')]"));
        }
    }

    @Test(priority = 2)
    public void loginRegisteredUserPositiveTest() {
        //click on Login link
        click(By.xpath("//a[contains(.,'LOGIN')]"));
        //fill login form
        type(By.cssSelector("[placeholder='Email']"), "manuel+4@gmail.com");
        type(By.cssSelector("[placeholder='Password']"), "Manuel12345$");
        //click on Login button
        click(By.name("login"));
        //verify user Logged in
        Assert.assertTrue(isElementPresent(By.xpath("//button[contains(.,'Sign Out')]")));
    }

    @Test(priority = 3)
    public void loginRegisteredUserNegativeWithInvalidPasswordTest() {
        //click on Login link
        click(By.xpath("//a[contains(.,'LOGIN')]"));
        //fill login form
        type(By.cssSelector("[placeholder='Email']"), "manuel+4@gmail.com");
        type(By.cssSelector("[placeholder='Password']"), "Manuel12345");
        //click on Login button
        click(By.name("login"));
        //verify user Logged in
        Assert.assertTrue(isAlertPresent());
    }
}
