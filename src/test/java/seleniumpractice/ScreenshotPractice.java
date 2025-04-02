package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumpractice.utils.WaitUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;


public class ScreenshotPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // implicit wait

        // login
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        // waiting for dashbaord
        Wait explicit_wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        explicit_wait.until(ExpectedConditions.urlContains("dashboard"));
        WaitUtils.waitFor(2);

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File dashboardScreenshot = screenshot.getScreenshotAs(OutputType.FILE);
        File pathToSave = new File("dashboard.png");
        try {
            FileUtils.copyFile(dashboardScreenshot, pathToSave);
//            FileUtils.copyFile(screenshot.getScreenshotAs(OutputType.FILE), new File("dashboard2.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        driver.quit();
    }
}
