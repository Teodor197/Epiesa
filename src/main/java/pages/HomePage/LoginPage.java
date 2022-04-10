package pages.HomePage;

import org.openqa.selenium.By;
import pages.commonPage.BasePage;

public class LoginPage extends BasePage {

    private final By loginEmailInput = By.xpath("//input[@name='login_utilizator']");
    private final By loginPasswordInput = By.xpath("//input[@name='login_parola']");
    private final By authenticateButton = By.xpath("//button[text()='Autentificare']");
    private final By emailInput = By.xpath("//input[@name='email']");
    private final By firstNameInput = By.xpath("//input[@name='nume']");
    private final By lastNameInput = By.xpath("//input[@name='prenume']");
    private final By passwordInput = By.xpath("//input[@name='parola']");
    private final By confirmPasswordInput = By.xpath("//input[@name='confirmare_parola']");
    private static final String getUserDetails = "//input[@value='%s']";
    private final By registerButton = By.xpath("//input[@value='INREGISTRARE']");

    public void insertTextIntoLoginEmailInput(String emailAddress){
        LOG.info("Insert text into login email address");
        driver.findElement(loginEmailInput).sendKeys(emailAddress);
    }

    public void insertTextIntoLoginPasswordInput(String password){
        LOG.info("Insert text into login password");
        driver.findElement(loginPasswordInput).sendKeys(password);
    }

    public void clickAuthenticateButton(){
        LOG.info("Click on Authenticate");
        driver.findElement(authenticateButton).click();
    }

    public void insertTextIntoEmailInput(String emailAddress){
        LOG.info("Insert text into email address");
        driver.findElement(emailInput).sendKeys(emailAddress);
    }

    public void insertTextIntoFirstNameInput(String firstName){
        LOG.info("Insert text into email address");
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void insertTextIntoLastNameInput(String lastName){
        LOG.info("Insert text into email address");
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void insertTextIntoPasswordInput(String password){
        LOG.info("Insert text into email address");
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void insertTextIntoConfirmPasswordInput(String confirmPassword){
        LOG.info("Insert text into email address");
        driver.findElement(confirmPasswordInput).sendKeys(confirmPassword);
    }

    public void clickRegisterButton(){
        LOG.info("Click on RegisterButton");
        driver.findElement(registerButton).click();
    }


    public String getUserDetails(String userDetails) {
        return driver.findElement(By.xpath(String.format(getUserDetails, userDetails))).getAttribute("value");
    }
}