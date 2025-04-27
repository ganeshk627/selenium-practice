package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Locators
    By USERNAME_INPUT = By.cssSelector("input[placeholder='Username']");
    By PASSWORD_INPUT = By.xpath("//input[@placeholder='Password']");
    By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");

    // Constructor
    public LoginPage (WebDriver rdriver) {
        driver = rdriver;
    }

    // Methods
    // enter username
    public void enterUsername(String username) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
    }


    // enter password
    public void enterPassword(String password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    // click login
    public void clickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
    }


}
