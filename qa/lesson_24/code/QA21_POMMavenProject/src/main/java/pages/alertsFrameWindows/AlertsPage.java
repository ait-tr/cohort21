package pages.alertsFrameWindows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;

import java.time.Duration;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "timerAlertButton")
    WebElement timerAlertButton;

    public AlertsPage clickByAlertButtonWithTimer() {
        click(timerAlertButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
        myAlert.accept();
        return this;
    }

    @FindBy(id = "confirmButton")
    WebElement confirmButton;

    public AlertsPage clickByAlertButtonWithSelect(String text) {
        click(confirmButton);
        if (text!=null && text.equalsIgnoreCase("ok")) {
            driver.switchTo().alert().accept();
        } else if (text!=null && text.equalsIgnoreCase("cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "confirmResult")
    WebElement confirmResult;

    public AlertsPage assertByResult(String text) {
        Assert.assertTrue(confirmResult.getText().contains(text));
        return this;
    }

    @FindBy(id = "promtButton")
    WebElement promtButton;

    public AlertsPage sendTextToAlert(String text) {

        clickWithJSExecutor(promtButton,0,50);
        if (text!=null) {
            driver.switchTo().alert().sendKeys(text);
        }
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(id = "promptResult")
    WebElement promptResult;

    public AlertsPage acceptByMessage(String message) {
        Assert.assertTrue(promptResult.getText().contains(message));
        return this;
    }
}
