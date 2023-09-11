package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;

import java.time.Duration;

public class InvalidLoginTest {

//    private static final By USERNAME = By.xpath("//input[@name='username']");
//    private static final By PASSWORD = By.xpath("//input[@name='password']");
//    private static final By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);


        loginPage.fillUsername("chandru");
        loginPage.fillPassword("admin123");
        loginPage.clickLogin();


//        dashboardPage.verifyDashboard();

        driver.quit();

    }
}
