import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.w3schools.com/css/css_table.asp");
        //driver.navigate().to(""); // with history
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("accept-choices")).click();
    }

    @Test
    public void tableCssTest() {
        //get row 8, last element
        WebElement canada = driver.findElement(By.cssSelector("tr:nth-child(8) td:last-child"));
        System.out.println(canada.getText());
        System.out.println("======================================================");

        // get row 4
        WebElement row = driver.findElement(By.cssSelector("tr:nth-child(4)"));
        System.out.println(row.getText());
        System.out.println("=============================================");

        //print numbers of row
        List<WebElement> rows = driver.findElements(By.cssSelector("tr"));
        System.out.println(rows.size());
        for (WebElement el: rows) {
            System.out.println(el.getText());
        }
        System.out.println("=============================================");
        for (int i = 0; i < rows.size(); i++) {
            System.out.println(rows.get(i).getText());
        }
    }

    @AfterMethod(enabled = true)
    public void tearDown() {
        driver.quit();
    }
}
