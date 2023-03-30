import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{
    //precondition: login, add contact
    @BeforeMethod
    public void ensurePreconditions() {
        if (!isElementPresent(By.xpath("//a[contains(.,'LOGIN')]"))) {
            //click on Sign out button
            click(By.xpath("//button[contains(.,'Sign Out')]"));
        }else {
            click(By.xpath("//a[contains(.,'LOGIN')]"));
            type(By.cssSelector("[placeholder='Email']"), "manuel+4@gmail.com");
            type(By.cssSelector("[placeholder='Password']"), "Manuel12345$");
            click(By.name("login"));

            click(By.cssSelector("a:nth-child(5)"));
            type(By.cssSelector("input:nth-child(1)"), "Karl");
            type(By.cssSelector("input:nth-child(2)"), "Adam");
            type(By.cssSelector("input:nth-child(3)"), "1234567890");
            type(By.cssSelector("input:nth-child(4)"), "adam@gm.co");
            type(By.cssSelector("input:nth-child(5)"), "Koblenz");
            type(By.cssSelector("input:nth-child(6)"), "torwart");
            click(By.cssSelector(".add_form__2rsm2 button"));
        }
    }

    @Test
    public void removeContactTest() {
        int sizeBefore = sizeOfContacts();
        System.out.println(sizeBefore);
        //click on the Contact card
        click(By.cssSelector(".contact-item_card__2SOIM"));
        //click on Remove button
        click(By.xpath("//button[contains(.,'Remove')]"));
        pause(1000);
        int sizeAfter = sizeOfContacts();
        System.out.println(sizeAfter);
        //check Contact is removed
        Assert.assertEquals(sizeBefore-1,sizeAfter);
    }

    public int sizeOfContacts() {
        if (isElementPresent(By.cssSelector(".contact-item_card__2SOIM"))) {
            return driver.findElements(By.cssSelector(".contact-item_card__2SOIM")).size();
        } else {
            return 0;
        }
    }
}
