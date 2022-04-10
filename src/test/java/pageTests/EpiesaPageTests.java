package pageTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.*;
import pages.HomePage.*;
import pages.commonPage.BasePage;

import static org.testng.AssertJUnit.assertEquals;

public class EpiesaPageTests extends BasePage {

    HomePage homePage = new HomePage();
    NavigationBarPage navBarPage = new NavigationBarPage();
    CarPartsPage carPartsPage = new CarPartsPage();
    CarModelPage carModelPage = new CarModelPage();
    ShopLocationPage shopLocationPage = new ShopLocationPage();
    LoginPage loginPage = new LoginPage();

    private static final String password = "12345";

    @BeforeMethod
    public void setUpTest() {
        setUp();
    }

    @AfterMethod
    public void browserQuit() {
        tearDown();
    }

    @Test
    public void clickPieseAutoChooseCarAndVerifyCarPart() {
        navBarPage.clickPieseAutoButton();
        carModelPage.clickCarNameButton("BMW");
        carModelPage.clickCarModelNameButton();
        carModelPage.clickCarYearModelButton();
        carModelPage.clickCarFuelType();
        carModelPage.clickCarHorsePower();
        carPartsPage.clickTypeOfFilterCarPartName("Filtru aer");
        assertEquals(carPartsPage.getCarPartTitleName(), "FILTRU AER BMW SERIA 3 (E46) 320 D DIESEL 150 CAI");
    }

    @Test
    public void createNewUserAndVerifyDetails() {
        final String email = RandomStringUtils.randomAlphabetic(13) +  "@testautomation.com";
        final String firstName = "Test First";
        final String lastName = "Test Last";
        navBarPage.goToLoginRegisterPage();

        loginPage.insertTextIntoEmailInput(email);
        loginPage.insertTextIntoFirstNameInput(firstName);
        loginPage.insertTextIntoLastNameInput(lastName);
        loginPage.insertTextIntoPasswordInput(password);
        loginPage.insertTextIntoConfirmPasswordInput(password);
        loginPage.clickRegisterButton();

        assertEquals(loginPage.getUserDetails(firstName), firstName);
        assertEquals(loginPage.getUserDetails(lastName), lastName);
        assertEquals(loginPage.getUserDetails(email), email);
    }

    @Test
    public void loginUserAndLogout() throws InterruptedException {
        final String firstName = "Test";
        final String lastName = "Name";
        final String email = "testautomation@mail.com";
        navBarPage.goToLoginRegisterPage();

        loginPage.insertTextIntoLoginEmailInput(email);
        loginPage.insertTextIntoLoginPasswordInput(password);
        loginPage.clickAuthenticateButton();

        Thread.sleep(3000);
        assertEquals(loginPage.getUserDetails(firstName), firstName);
        assertEquals(loginPage.getUserDetails(lastName), lastName);
        assertEquals(loginPage.getUserDetails(email), email);
    }

    @Test
    public void chooseCarModelAndSelectAnyCarPart() {
        homePage.clickMarcaDropDown();
        homePage.clickDropdownOption("BMW");
        homePage.clickModelDropDown();
        homePage.clickDropdownOption("Seria 3 (E46) (1997 - 2005)");
        homePage.clickCarburantDropDown();
        homePage.clickDropdownOption("diesel");
        homePage.clickCilindreeDropDown();
        homePage.clickDropdownOption("320 d");
        homePage.clickPutereDropDown();
        homePage.clickDropdownOption("150 cai/110 kw, tractiune pe spate (M47 D20 (204D4))");
        carPartsPage.clickTypeOfFilterCarPartName("Filtru aer");
        assertEquals(carPartsPage.getCarPartTitleName(), "FILTRU AER BMW SERIA 3 (E46) 320 D DIESEL 150 CAI");
    }

    @Test
    public void searchForCarPartAndVerifyTheName() throws InterruptedException {
        navBarPage.insertTextIntoSearchBar("baterie");
        Thread.sleep(500);
        navBarPage.clickSearchBarDropdownValue("Baterie aut625 13o BANNER 610 11 BUFFALO BULL 12V 110AH, 720A");
        assertEquals(carPartsPage.getCarPartTitleName(), "BATERIE AUT625 13O BANNER 610 11 BUFFALO BULL 12V 110AH, 720A");
    }

    @Test
    public void clickShopLocationAndVerifyAddress() {
        shopLocationPage.clickShopLocationAddressButton();
        assertEquals(shopLocationPage.getAddressLocation(), "ADRESA: SECTOR 3 - Sos. Mihai Bravu, Nr. 327, Bl. 54");
    }
}
