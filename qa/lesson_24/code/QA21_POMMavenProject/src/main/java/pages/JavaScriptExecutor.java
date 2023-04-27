package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutor extends BasePage {

    JavascriptExecutor js;

    public JavaScriptExecutor(WebDriver driver) {
        super(driver);
        js = (JavascriptExecutor) driver;
    }

    public JavaScriptExecutor enterDataWithJS(String user, String email) {

        if (user != null && email != null) {
            js.executeScript("document.getElementById('userName').value='" + user + "';");
            js.executeScript("document.getElementById('userEmail').value='" + email + "';");
        }

        return this;
    }

    public JavaScriptExecutor clickOnSubmitWithJS() {
        js.executeScript("document.getElementById('submit').click();");
        return this;
    }

    public JavaScriptExecutor checkBoxWithJS() {
        js.executeScript("document.querySelector('#hobbies-checkbox-1').checked=false;");
        js.executeScript("document.querySelector('#hobbies-checkbox-1').checked=true;");
        return this;
    }

    public JavaScriptExecutor refreshWithJS() {
        js.executeScript("history.go(0);");
        return this;
    }
}
