package practice.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitMechanisms {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");



        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlContains("dashboard"));
        //wait.until(ExpectedConditions.);

        String actual_url = driver.getCurrentUrl();
        System.out.println(actual_url);
        String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

        if(expected_url.equals(actual_url)) {
            System.out.println("Matching...");
        } else {
            System.out.println("Not matching...");
        }


        try {
            Thread.sleep(5000);
        } catch (Exception e){}

        driver.quit();

    }
}
