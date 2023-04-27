package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.alertsFrameWindows.AlertsPage;
import pages.alertsFrameWindows.BrowserWindowsPage;
import pages.bookStore.BookStorePage;
import pages.bookStore.LoginPage;
import pages.bookStore.ProfilePage;
import pages.elements.BrokenLinksImagesPage;
import pages.interactions.DroppablePage;
import pages.widgets.SelectMenuPage;

public class SidePanel extends BasePage{
    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Login']")
    WebElement login;

    public LoginPage getLoginPage() {
        clickWithJSExecutor(login,0,400);
        return new LoginPage(driver);
    }

    @FindBy(css = ".show #item-3")
    WebElement profile;

    public ProfilePage selectProfile() {
        clickWithJSExecutor(profile, 0, 500);
        return new ProfilePage(driver);
    }

    @FindBy(xpath = "//span[.='Book Store']")
    WebElement bookStore;

    public BookStorePage selectBookStore() {
        clickWithJSExecutor(bookStore,0,400);
        return new BookStorePage(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
        clickWithJSExecutor(alerts,0,300);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;

    public BrowserWindowsPage selectBrowserWindows() {
        clickWithJSExecutor(browserWindows,0,50);
        return new BrowserWindowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;

    public SelectMenuPage selectSelectMenu() {
        clickWithJSExecutor(selectMenu,0,600);
        return new SelectMenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;

    public DroppablePage selectDroppable() {
        clickWithJSExecutor(droppable,0,600);
        return new DroppablePage(driver);
    }

    @FindBy(xpath = "//span[.='Text Box']")
    WebElement textBox;

    public JavaScriptExecutor selectTextBox() {
        click(textBox);
        return new JavaScriptExecutor(driver);
    }

    @FindBy(xpath = "//span[.='Check Box']")
    WebElement checkBox;

    public JavaScriptExecutor selectCheckBox() {
        click(checkBox);
        return new JavaScriptExecutor(driver);
    }

    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement practiceForm;

    public JavaScriptExecutor selectPracticeForm() {
        clickWithJSExecutor(practiceForm,0,300);
        return new JavaScriptExecutor(driver);
    }

    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement brokenLinksImages;

    public BrokenLinksImagesPage selectBrokenLinksImages() {
        clickWithJSExecutor(brokenLinksImages,0,500);
        return new BrokenLinksImagesPage(driver);
    }
}
