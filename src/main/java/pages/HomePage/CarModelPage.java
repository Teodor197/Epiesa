package pages.HomePage;

import org.openqa.selenium.By;
import pages.commonPage.BasePage;

public class CarModelPage extends BasePage {

    private static final String carName = "//p[text()='%s']";
    private static final By carModelName = By.xpath("//a[@title='piese auto bmw seria 3']");
    private static final By carYearModelName = By.xpath("//a[@title='piese auto bmw Seria 3 (E46)']");
    private static final By carFuelType = By.xpath("//a[@title='piese auto bmw Seria 3 320 d']");
    private static final By carHorsePower = By.xpath("//a[@title='piese auto bmw seria 3 320 d diesel 150 cai ']");

    public void clickCarNameButton(String carManufacturerName) {
        LOG.info("Click on the car name");
        driver.findElement(By.xpath(String.format(carName, carManufacturerName))).click();
    }

    public void clickCarModelNameButton() {
        LOG.info("Click on the car model name");
        driver.findElement(carModelName).click();
    }

    public void clickCarYearModelButton() {
        LOG.info("Click on the car year model");
        driver.findElement(carYearModelName).click();
    }

    public void clickCarFuelType() {
        LOG.info("Click on the car fuel type");
        driver.findElement(carFuelType).click();
    }

    public void clickCarHorsePower() {
        LOG.info("Click on the car horse power");
        driver.findElement(carHorsePower).click();
    }
}
