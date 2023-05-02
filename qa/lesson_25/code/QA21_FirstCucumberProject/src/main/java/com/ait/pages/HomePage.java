package com.ait.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = "div:nth-child(2)>div>div")
    WebElement homeComponent;

    public HomePage isHomeComponentPresent() {
        isElementDisplayed(homeComponent);
        return this;
    }

    @FindBy(xpath = "//a[contains(.,'LOGIN')]")
    WebElement loginLink;

    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }
}
