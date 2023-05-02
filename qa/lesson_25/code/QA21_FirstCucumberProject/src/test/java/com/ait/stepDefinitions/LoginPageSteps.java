package com.ait.stepDefinitions;

import com.ait.pages.HomePage;
import com.ait.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ait.pages.BasePage.driver;

public class LoginPageSteps {

    @And("User clicks on Login link")
    public void click_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enter_valid_data() {
        new LoginPage(driver).enterData("manuel+4@gmail.com","Manuel12345$");
    }

    @And("User clicks on Login button")
    public void click_on_Login_button() {
        new LoginPage(driver).clickOnLoginButton();
    }

    @Then("User verifies SignOut button is displayed")
    public void verify_SignOut_button_is_displayed() {
        new LoginPage(driver).isSignOutButtonDisplayed();
    }

    @And("User enters a valid email and wrong password")
    public void enter_valid_email_wrong_password(DataTable table) {
        new LoginPage(driver).enterWrongPassword(table);
    }

    @Then("User verifies Alert is appears")
    public void verify_Alert_appears() {
        new LoginPage(driver).pause(2000);
        new LoginPage(driver).isAlertAppears();
    }
}
