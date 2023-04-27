package pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.List;

public class SelectMenuPage extends BasePage {

    public SelectMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "oldSelectMenu")
    WebElement oldSelectMenu;

    public SelectMenuPage selectOldStyle(String color) {

        Select select = new Select(oldSelectMenu);
        select.selectByVisibleText(color);

        List<WebElement> options = select.getOptions();

        System.out.println(select.getFirstSelectedOption().getText() + " is first");

        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
        return this;
    }

    @FindBy(xpath = "(//div[@class=' css-2b097c-container'])[3]")
    WebElement multiSelect;

    @FindBy(xpath = "//html")
    WebElement space;

    public SelectMenuPage multiSelect(String text) {
        click(multiSelect);
        WebElement element = driver.findElement(By.xpath(String.format("//div[text()='%s']",text)));
        click(element);
        click(space);
        return this;
    }

    @FindBy(id = "cars")
    WebElement cars;

    public SelectMenuPage standardMultiSelect(int index) {

        Select multi = new Select(cars);
        if (multi.isMultiple()) {
            multi.selectByIndex(index);
        }
        return this;
    }
}
