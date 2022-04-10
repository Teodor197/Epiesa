package pages.HomePage;

import org.openqa.selenium.By;
import pages.commonPage.BasePage;

public class CarPartsPage extends BasePage {

    private final By carPartTitleName = By.xpath("//div/h1[text()]");
    private static final String typeOfFilterCarPart = "//a[text()='%s']";

    public String getCarPartTitleName() {
        LOG.info("Returns the name of the car part");
        return driver.findElement(carPartTitleName).getText();
    }

    public void clickTypeOfFilterCarPartName(String typeOfFiler) {
        LOG.info("Click on type of filter car part");
        driver.findElement(By.xpath(String.format(typeOfFilterCarPart, typeOfFiler))).click();
    }
}
