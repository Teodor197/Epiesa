package pageTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage.HomePage;
import pages.commonPage.BasePage;

public class EpiesaPageTests extends BasePage {

    HomePage homePage = new HomePage();

    @BeforeClass
    public void setUpTest() {
        setUp();
    }

    @AfterClass
    public void browserQuit() {
        tearDown();
    }

    @Test
    public void searchBarTest(){
        homePage.insertTextIntoSearchBar("baterie");
        homePage.clickSearchButton();
    }
}
