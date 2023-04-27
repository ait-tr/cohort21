package tests.interactions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SidePanel;
import pages.interactions.DroppablePage;
import tests.TestBase;

public class DropDragTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getInteractions();
        new SidePanel(driver).selectDroppable();
    }

    @Test
    public void droppableTest() {
        new DroppablePage(driver).actionDragMe();
    }

    @Test
    public void droppableByTest() {
        new DroppablePage(driver).dragAndDropBy(20,35);
    }

    @Test
    public void droppableByIndexTest() {
        new DroppablePage(driver).dragAndDropByIndex(200,350);
    }
}
