package pages.HomePage;

import org.openqa.selenium.By;
import pages.commonPage.BasePage;

public class ShopLocationPage extends BasePage {

    private final By shopLocationAddressButton = By.xpath("//a[@title='magazin piese auto SECTOR 3']");
    private final By getAddressLocation = By.xpath("//div[@class='row']//b");

    public void clickShopLocationAddressButton() {
        LOG.info("Click on button Piese auto SECTOR 3, BUCURESTI");
        driver.findElement(shopLocationAddressButton).click();
    }

    public String getAddressLocation() {
        LOG.info("Returns the name of the address");
        return driver.findElement(getAddressLocation).getText();
    }
}
