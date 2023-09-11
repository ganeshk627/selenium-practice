package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver ldriver;
    private static final By USERNAME = By.name("username");
    private static final By PASSWORD = By.xpath("//input[@name='password']");
    private static final By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");


    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
    }


    public void fillUsername(String username) {

        ldriver.findElement(USERNAME).clear();
        ldriver.findElement(USERNAME).sendKeys(username);
    }

    public void fillPassword(String password) {
        ldriver.findElement(PASSWORD).clear();
        ldriver.findElement(PASSWORD).sendKeys(password);
    }

    public void clickLogin() {
        ldriver.findElement(LOGIN_BUTTON).click();
    }

}
