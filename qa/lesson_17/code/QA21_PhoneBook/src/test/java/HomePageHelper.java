import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper{
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isComponentFormPresent() {
        return isElementPresent(By.cssSelector("div:nth-child(2)>div>div"));
    }

    public boolean isComponentFormPresent2() {
        return isElementPresent2(By.cssSelector("div:nth-child(2)>div>div"));
    }
}