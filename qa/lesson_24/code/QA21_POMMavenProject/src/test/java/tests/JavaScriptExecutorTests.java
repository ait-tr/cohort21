package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.JavaScriptExecutor;
import pages.SidePanel;
import pages.data.UserData;

public class JavaScriptExecutorTests extends TestBase{

    @Test
    public void executorTest() {
        new HomePage(driver).getElements();
        new SidePanel(driver).selectTextBox();
        new JavaScriptExecutor(driver)
                .enterDataWithJS(UserData.USER_NAME,UserData.USER_EMAIL)
                .clickOnSubmitWithJS();
    }

    @Test
    public void checkBoxWithJSTest() {
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
        new JavaScriptExecutor(driver).checkBoxWithJS().refreshWithJS();
    }
}
