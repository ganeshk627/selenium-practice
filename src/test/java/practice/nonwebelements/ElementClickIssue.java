package practice.nonwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ElementClickIssue {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.lambdatest.com/selenium-playground/");

//        driver.findElement(By.xpath("//a[normalize-space()='Certifications']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='TestMu Conf 2023']"));
//        js.executeScript("arguments[0].scrollIntoView();", element);
//        element.click();

        js.executeScript("arguments[0].click();", element);


        try {
            Thread.sleep(5000);
        } catch (Exception e){}
        driver.quit();
    }
}
