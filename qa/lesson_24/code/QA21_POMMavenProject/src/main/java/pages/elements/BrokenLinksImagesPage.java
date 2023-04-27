package pages.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.Iterator;
import java.util.List;

public class BrokenLinksImagesPage extends BasePage {

    public BrokenLinksImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "a")
    List<WebElement> links;

    public BrokenLinksImagesPage checkAllLinks() {
        System.out.println("Total number of links on the page is " + links.size());

        String url = "";
        Iterator<WebElement> iterator = links.iterator();
        while (iterator.hasNext()) {
            url = iterator.next().getText();
            System.out.println(url);
        }
        return this;
    }

    public BrokenLinksImagesPage checkBrokenLinks() {
        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            verifyLinks(url);
        }
        return this;
    }

    @FindBy(tagName = "img")
    List<WebElement> images;

    public BrokenLinksImagesPage checkBrokenImages() {
        for (int i = 0; i < images.size(); i++) {
            WebElement image = images.get(i);
            String imageUrl = image.getAttribute("src");
            System.out.println("URL of image " + (i + 1) + " is " + imageUrl);
            verifyLinks(imageUrl);
            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript
                        ("return (typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth>0)", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                    System.out.println("******************************************");
                } else {
                    System.out.println("DISPLAY - BROKEN");
                }
            } catch (Exception e) {
                System.out.println("Error occurred");
            }
        }
        return this;
    }
}
