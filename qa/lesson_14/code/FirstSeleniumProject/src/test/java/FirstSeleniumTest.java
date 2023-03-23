import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {
    WebDriver driver;

    //before - setUp
    @BeforeMethod
    public void setUp() {
        //driver = new FirefoxDriver();
        //driver = new EdgeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
        // driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com"); // with history
        //maximize browser to window with
        driver.manage().window().maximize();
        //wait for all elements on the site to load before starting the test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //test
    @Test
    public void openSite() {
        System.out.println("Site opened!!!");
    }

    //after - tearDown
    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();//all tabs & close browser
        // driver.close(); // only one tab(if tab only one -> close browser)
    }
}
