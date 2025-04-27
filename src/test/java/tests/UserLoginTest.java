package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.LoginPage;

import java.time.Duration;

public class UserLoginTest {
    public static void main(String[] args) {
        String username= "peter.mac.anderson";
        String password = "user123";
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // implicit wait
        LoginPage loginPage = new LoginPage(driver);

//        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(username);
        loginPage.enterUsername(username);
//        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        loginPage.enterPassword(password);
//        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        loginPage.clickLogin();

        // Explicit wait - waits untill the url contains 'dashboard'
        Wait explicit_wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        explicit_wait.until(ExpectedConditions.urlContains("dashboard"));


        String url = driver.getCurrentUrl();
        if (url.contains("dashboard")) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Unsuccessful!");
        }

        driver.quit();
    }
}
