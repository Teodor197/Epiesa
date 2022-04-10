package pages.HomePage;

import org.openqa.selenium.By;
import pages.commonPage.BasePage;

public class NavigationBarPage extends BasePage {

    private final By searchBar = By.id("headersearch");
    private final By pieseAutoButton = By.xpath("//a[@title='piese auto dupa marca']");
    private static final String searchBarDropdownValue = "//div[@id='topsearch']//a[text()='%s']";

    public void insertTextIntoSearchBar(String value) {
        LOG.info("Click on the SearchBar");
        driver.findElement(searchBar).click();
        LOG.info("Insert text into SearchBar");
        driver.findElement(searchBar).sendKeys(value);
    }

    public void goToLoginRegisterPage() {
        driver.get("https://www.epiesa.ro/autentificare-epiesa/");
    }


    public void clickPieseAutoButton(){
        LOG.info("Click on the PieseAutoButton");
        driver.findElement(pieseAutoButton).click();
    }

    public void clickSearchBarDropdownValue(String carPart){
        LOG.info("Click on SearchBarDropdownValue");
        driver.findElement(By.xpath(String.format(searchBarDropdownValue, carPart))).click();
    }

}