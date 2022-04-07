package pages.HomePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.commonPage.BasePage;

public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);

    private final By searchBar = By.id("headersearch");
    private final By searchButton = By.xpath("//input[@type='submit']");
    private By pieseAutoButton = By.xpath("//a[@title='piese auto dupa marca']");
    private By contulMeuButton = By.xpath("//a[@class='dropdown-toggle']");
    private By loginButton = By.xpath("//a[text()='LOGIN / CONT NOU']");
    private By marcaDropDown = By.xpath("//select[@name='select_marca']");
    private By modelDropDown = By.id("model_marca");
    private By carburantDropDown = By.id("carburant");
    private By cilindreeDropDown = By.id("cilindree");
    private By putereDropDown = By.id("motorizari");
    private By locatiaMagazinSectorTreiButton = By.xpath("//a[@title='magazin piese auto SECTOR 3']");
    private By searchBarDropdownValue = By.xpath("//div[@id='topsearch']//a[text()='%s']");

    public void insertTextIntoSearchBar(String value) {
        LOG.info("Click on the SearchBar");
        driver.findElement(searchBar).click();
        LOG.info("Insert text into SearchBar");
        driver.findElement(searchBar).sendKeys(value);
    }

    public void clickSearchButton() {
        LOG.info("Click on the SearchButton");
        driver.findElement(searchButton).click();
    }
}
