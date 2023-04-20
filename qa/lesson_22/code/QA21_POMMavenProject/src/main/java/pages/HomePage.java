package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.bookStore.BookStorePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Book Store Application']")
    WebElement booStoreApp;

    public BookStorePage getBookStore() {
        clickWithJSExecutor(booStoreApp,0,800);
        return new BookStorePage(driver);
    }
}
