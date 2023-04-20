package tests.bookStore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.bookStore.BookStorePage;

public class SearchBookTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getBookStore();
    }

    @Test
    public void searchBookPositiveTest() {
        new BookStorePage(driver).typeInSearchField("Git")
                .assertNameOfBook("Git");
    }
}
