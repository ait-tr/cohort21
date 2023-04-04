import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends BaseHelper{

    public HeaderHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isLoginLinkPresent() {
        return isElementPresent(By.xpath("//a[contains(.,'LOGIN')]"));
    }

    public void clickOnLoginLink() {
        click(By.xpath("//a[contains(.,'LOGIN')]"));
    }
}