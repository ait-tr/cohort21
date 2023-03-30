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

public class FirstFindElementTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("https://telranedu.web.app");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTagTest() {
        //find element by tag
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());

        //find list of element by tag
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void xpathTest() {
        //parent
        driver.findElement(By.xpath("//h1/parent::*"));
        driver.findElement(By.xpath("//h1/parent::div"));
        driver.findElement(By.xpath("//h1/.."));
        //ancestor
        driver.findElements(By.xpath("//button/ancestor::*"));//all
        driver.findElements(By.xpath("//button/ancestor::div"));//two options
        driver.findElement(By.xpath("//button/ancestor::div[2]"));//one option
        //following-sibling
        driver.findElements(By.xpath("//h1/following-sibling::a"));
        //preceding-sibling
        driver.findElement(By.xpath("//a[@href='/login']/preceding-sibling::h1"));

    }

    // text() - returns text of element
    // contains() - return path of text
    //start-with() //button[@type='submit' and starts-with(.,'Log')]
}
