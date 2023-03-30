import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AddContactTests extends TestBase{
    //precondition: verify User log out, log in
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//button[contains(.,'Sign Out')]"))) {
            click(By.xpath("//a[contains(.,'LOGIN')]"));

            type(By.cssSelector("[placeholder='Email']"), "manuel+4@gmail.com");
            type(By.cssSelector("[placeholder='Password']"), "Manuel12345$");
            click(By.name("login"));
        }
    }

    @Test
    public void addContactPositiveTest() {
        int i = (int)(System.currentTimeMillis()/1000) % 3600;
        //click on Add link
        click(By.cssSelector("a:nth-child(5)"));

        //fill add contact form
        type(By.cssSelector("input:nth-child(1)"), "Karl" + i);
        type(By.cssSelector("input:nth-child(2)"), "Adam");
        type(By.cssSelector("input:nth-child(3)"), "1234567890");
        type(By.cssSelector("input:nth-child(4)"), "adam@gm.co");
        type(By.cssSelector("input:nth-child(5)"), "Koblenz");
        type(By.cssSelector("input:nth-child(6)"), "torwart");
        // click on save button
        click(By.cssSelector(".add_form__2rsm2 button"));
        //check Contact is added
        Assert.assertTrue(isContactCreated("Karl"));
    }

    public boolean isContactCreated(String text) {
        List<WebElement> contacts = driver.findElements(By.cssSelector("h2"));

        for (WebElement el : contacts) {
            if (el.getText().contains(text))
                return true;
        }
        return false;
    }
}
