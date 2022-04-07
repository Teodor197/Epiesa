package pages.commonPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        String url = "https://www.epiesa.ro/";
        driver.get(url);
        LOG.info("Open browser");
        driver.manage().window().fullscreen();
    }

    public static void tearDown() {
        LOG.info("Close the browser");
        driver.quit();
    }

}

