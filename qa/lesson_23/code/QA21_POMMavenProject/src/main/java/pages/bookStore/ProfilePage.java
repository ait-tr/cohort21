package pages.bookStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName-value")
    WebElement user;

    public ProfilePage assertAccount(String uName) {
        pause(2000);
        Assert.assertTrue(shouldHave(user,uName,15));
        return this;
    }

    @FindBy(id = "submit")
    WebElement submitButton;


    public LoginPage logout() {
        System.out.println("Let's out from profile");
        click(submitButton);
        return new LoginPage(driver);
    }
}
