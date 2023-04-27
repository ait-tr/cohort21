package tests.elements;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SidePanel;
import pages.elements.BrokenLinksImagesPage;
import tests.TestBase;

public class BrokenLinksImagesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getElements();
        new SidePanel(driver).selectBrokenLinksImages();
    }

    @Test
    public void checkAllLinksTest() {
        new BrokenLinksImagesPage(driver).checkAllLinks();
    }

    @Test
    public void checkBrokenLinksTest() {
        new BrokenLinksImagesPage(driver).checkBrokenLinks();
    }

    @Test
    public void checkBrokenImagesTest() {
        new BrokenLinksImagesPage(driver).checkBrokenImages();
    }
}
