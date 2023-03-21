import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    //before - setUp
    @BeforeMethod
    public void setUp() {
        // driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
    }
    //test

    @Test
    public void openSite() {
        System.out.println("Site opened!!!");
    }
    //after - tearDown
}
