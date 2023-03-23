import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumLocatorsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void startFindLocatorsTest() {
        //id
        driver.findElement(By.id("city"));
        //className
        driver.findElement(By.className("input-label"));
        //name
        driver.findElement(By.name("viewport"));
        //linkText
        WebElement element = driver.findElement(By.linkText("Let the car work"));
        System.out.println(element.getText());
        //partialLinkText
        WebElement element1 = driver.findElement(By.partialLinkText("car"));
        System.out.println(element1.getText());
    }

    @Test
    public void startFindCssTest() {
        //tagName = css
        //driver.findElement(By.tagName("div"));
        driver.findElement(By.cssSelector("div"));
        //id -> css(#)
        //driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#city"));
        //className -> css(.)
        // driver.findElement(By.className("input-label"));
        driver.findElement(By.cssSelector(".input-label"));
        //attribute -> css([])
        driver.findElement(By.cssSelector("[href='/search']"));
        driver.findElement(By.cssSelector("[for='dates']"));
        //contains -> *
        driver.findElement(By.cssSelector("[for*='ate']"));
        //start -> ^
        driver.findElement(By.cssSelector("[for^='dat']"));
        //end on -> $
        driver.findElement(By.cssSelector("[for$='tes']"));
    }

    @Test
    public void startFindXpath() {
        // -> //*[@attr='value']
        //tagName = xpath(//)
        //driver.findElement(By.tagName("div"));
        driver.findElement(By.xpath("//div"));
        //id -> xpath(//*[@id='value'])
        //driver.findElement(By.id("city"));
        driver.findElement(By.xpath("//*[@id='city']"));
        //className -> xpath(//*[@class='value'])
        // driver.findElement(By.className("input-label"));
        driver.findElement(By.xpath("//*[@class='input-label']"));
        //attribute -> xpath(//*[@attr='value'])
        driver.findElement(By.xpath("//*[@href='/search']"));
        driver.findElement(By.xpath("//*[@for='dates']"));
        //start -> //*[starts-with(@attr,'...')]
        driver.findElement(By.xpath("//*[starts-with(@for,'dat')]"));
        //contains, end on -> //*[contains(.,'...')]
        driver.findElement(By.xpath("//*[contains(.,'ate')]"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
