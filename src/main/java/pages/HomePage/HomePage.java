package pages.HomePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.commonPage.BasePage;

public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);

    private final By marcaDropDown = By.xpath("//select[@name='select_marca']");
    private final By modelDropDown = By.id("model_marca");
    private final By carburantDropDown = By.id("carburant");
    private final By cilindreeDropDown = By.id("cilindree");
    private final By putereDropDown = By.id("motorizari");
    private static final String dropdownOptionSelect = "//option[text()='%s']";

    public void clickMarcaDropDown(){
        LOG.info("Click on MarcaDropDown");
        driver.findElement(marcaDropDown).click();
    }

    public void clickModelDropDown(){
        LOG.info("Click on ModelDropDown");
        driver.findElement(modelDropDown).click();
    }

    public void clickCarburantDropDown(){
        LOG.info("Click on CarburantDropDown");
        driver.findElement(carburantDropDown).click();
    }

    public void clickCilindreeDropDown(){
        LOG.info("Click on CilindreeDropDown");
        driver.findElement(cilindreeDropDown).click();
    }

    public void clickPutereDropDown() {
        LOG.info("Click on PutereDropDown");
        driver.findElement(putereDropDown).click();
    }

    public void clickDropdownOption(String dropdownOption) {
        LOG.info("Click on specific dropdown option");
        driver.findElement(By.xpath(String.format(dropdownOptionSelect, dropdownOption))).click();
    }
}
